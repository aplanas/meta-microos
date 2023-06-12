SUMMARY = "Simplified python interface to the DQSEGDB API"
DESCRIPTION = "DQSEGDB2 is a simplified Python implementation of the DQSEGDB API \
as defined in LIGO-T1300625, providing a query interface for GET \
requests to DQSEGDB."
LICENSE = "GPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "python39-dqsegdb2-1.1.3-1.1.noarch.rpm"
RPM_HASH = "b4952b55b6bf3dc5ecb81be5d77f82042824942f201f20b05bcde99db5a4edfc3ba06d7871bffc0cea31612d0eba048425325fe2863c0a454ba7fa839277b237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dqsegdb2) \
python39-dqsegdb2 \
python3dist(dqsegdb2)"
RDEPENDS:${PN} += "python(abi) \
python39-gwdatafind \
python39-igwn-auth-utils \
python39-ligo-segments"

inherit rpm
