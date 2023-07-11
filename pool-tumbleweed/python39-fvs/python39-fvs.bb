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

RPM_NAME = "python39-fvs-0.3.4-1.5.noarch.rpm"
RPM_HASH = "5d37787d2bf78b12c650e52d677d4da9d964c58897dcb084aae57067e2fabc0a5085b444c1ccb1ea4ae90805ea856808c6e7408a71281c21b9e5f3b98e09d5ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fvs \
python39-fvs \
python3dist-fvs"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-orjson \
update-alternatives"

inherit rpm
