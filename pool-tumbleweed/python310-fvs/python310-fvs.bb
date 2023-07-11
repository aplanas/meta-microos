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

RPM_NAME = "python310-fvs-0.3.4-1.5.noarch.rpm"
RPM_HASH = "0fa7f5a010f62c6e023589d6d5d7a008714a3ed975623175fa527fb63e190fbdc55a5e802aef2bf220e21ffa7f2358760581246823f93ae8c15c3208638a95ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fvs \
python310-fvs \
python3dist-fvs"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-orjson \
update-alternatives"

inherit rpm
