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

RPM_NAME = "python311-fvs-0.3.4-1.5.noarch.rpm"
RPM_HASH = "4c163f51e7a678a34175a29909bb63eab76531d368b755618e51705d8d3cd15237ec797145e5301eda20287036911ad206d8f63829c6c1b37287a42190cad516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fvs \
python3.11dist-fvs \
python311-fvs \
python3dist-fvs"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-orjson \
update-alternatives"

inherit rpm
