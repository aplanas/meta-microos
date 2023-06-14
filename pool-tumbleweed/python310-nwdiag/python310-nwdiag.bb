SUMMARY = "Generator for network diagram images from text"
DESCRIPTION = "nwdiag generates network diagram images from text."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-nwdiag-3.0.0-1.5.noarch.rpm"
RPM_HASH = "b94065dfea444ff7f5ff1539c2b6fcfd996f58d33abb5813415553d7aeaaa942d377abad77d961951f67d18e1e21e1077a8a66047ac4acfb669f4ced686dcb28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nwdiag \
python3.10dist-nwdiag \
python310-nwdiag \
python3dist-nwdiag"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-blockdiag \
python310-setuptools \
update-alternatives"

inherit rpm
