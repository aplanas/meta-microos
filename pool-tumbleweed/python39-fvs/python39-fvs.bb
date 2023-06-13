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

RPM_NAME = "python39-fvs-0.3.4-1.3.noarch.rpm"
RPM_HASH = "8db53a845020c292cc69c48b0dc98a9e206a96560956b7b0494127d42e9429bb32cc4bdd2b63df0e31b551773ed21ef68936af1f426903e4e9d06086e9e214cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fvs) \
python39-fvs \
python3dist(fvs)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-orjson \
update-alternatives"

inherit rpm
