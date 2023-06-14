SUMMARY = "Check whether versions number match PEP 440"
DESCRIPTION = "A simple package with utils to check whether versions number match Pep 440."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-pep440-0.1.2-1.4.noarch.rpm"
RPM_HASH = "d04a0061077f449bd42c732f6d672d9aaaca1d74d8df1b4e1bea725a7555c3d8ae39613919daf0c4c0c75b64835c5cfe0292ebce10addc297b2392026044686b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pep440 \
python39-pep440 \
python3dist-pep440"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
