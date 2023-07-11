SUMMARY = "Python implementation of hashids"
DESCRIPTION = "Python implementation of hashids (http://www.hashids.org)."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python310-hashids-1.3.1-1.20.noarch.rpm"
RPM_HASH = "c8bdd6c17283e47f859654f509186d6bde6ebf12d7a9a258bee4f545eb9196b369c9f8ed9a89405f594e48794a8adf5a7220993fb439910fe2bcb31bdc5712b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hashids \
python310-hashids \
python3dist-hashids"

RDEPENDS:${PN} += "python-abi"

inherit rpm
