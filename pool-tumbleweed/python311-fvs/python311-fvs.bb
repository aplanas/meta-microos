SUMMARY = "File Versioning System with hash comparison"
DESCRIPTION = "File Versioning System with hash comparison and data storage to \
create unlinked states that can be deleted \
 \
The main reason for this project is for the purpose of personal \
knowledge and understanding of the versioning system. The second \
reason is to make a simple and easy-to-implement versioning \
system for Bottles. \
 \
There are plenty of other versioning systems out there, but all \
of these provide features that I wouldn't need in my projects. \
The purpose of FVS is to always remain as clear and simple as \
possible, providing only the functionality of organizing file \
versions into states, ie recovery points that take advantage of \
deduplication to minimize space consumption"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python311-fvs-0.3.4-1.3.noarch.rpm"
RPM_HASH = "c14315d671cda1e47f2ff6b8918b5b41861661b14eeb69bee1bc58ac7bd2d963fc297f6b72a0914eff94e907b5f680a04a93e5b6368a285dc4246e85f538d324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fvs) \
python311-fvs \
python3dist(fvs)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-orjson \
update-alternatives"

inherit rpm
