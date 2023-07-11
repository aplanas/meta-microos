SUMMARY = "Check whether versions number match PEP 440"
DESCRIPTION = "A simple package with utils to check whether versions number match Pep 440."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-pep440-0.1.2-1.6.noarch.rpm"
RPM_HASH = "8febdb002b326a9f6059f83f66c7430420cd94155cfad422b77f2ce4c5c18e070966fd9e66a7d5dc2d690536a82a1ca0da143c90ac4dae3051fb84f0a2e87a6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pep440 \
python39-pep440 \
python3dist-pep440"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
