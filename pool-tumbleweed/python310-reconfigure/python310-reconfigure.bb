SUMMARY = "Python ORM for config files"
DESCRIPTION = "Python ORM for config files."
LICENSE = "LGPL-3.0-only"

PV = "0.1.82"

RPM_NAME = "python310-reconfigure-0.1.82-1.16.noarch.rpm"
RPM_HASH = "17add9bf38f37c08a5997f556c773906bd0a0426c170cb9dc83cdd2f09d42df8616bb32a0a361a14cfc0641b07eb166f0e9b61cebc56e4d114a8dd49a90c4ea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reconfigure \
python3.10dist(reconfigure) \
python310-reconfigure \
python3dist(reconfigure)"

RDEPENDS:${PN} += "python(abi) \
python310-chardet"

inherit rpm
