SUMMARY = "Generator for network diagram images from text"
DESCRIPTION = "nwdiag generates network diagram images from text."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-nwdiag-3.0.0-1.6.noarch.rpm"
RPM_HASH = "c070e11a82540fbb0268694d1db8d4d2dc3d3a3f341e21bb6e256cf2c23fae15769baa924fea40a1c69079a0d7d19d5d2e0d2c6f53b210eff63e80abcfe8de24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nwdiag \
python3.11dist-nwdiag \
python311-nwdiag \
python3dist-nwdiag"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-blockdiag \
python311-setuptools \
update-alternatives"

inherit rpm
