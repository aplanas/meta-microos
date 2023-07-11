SUMMARY = "Generator for network diagram images from text"
DESCRIPTION = "nwdiag generates network diagram images from text."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-nwdiag-3.0.0-1.6.noarch.rpm"
RPM_HASH = "c75ad5349477dfae477e698e888969505b3aad06caf0d4a11d1950866de99602aa41ca3d4bc3d3f0504b4dbe80f103d3f8c07da2a77bb6013315c67d12e5c6da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nwdiag \
python310-nwdiag \
python3dist-nwdiag"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-blockdiag \
python310-setuptools \
update-alternatives"

inherit rpm
