SUMMARY = "A Python library for generating pseudorandom condition"
DESCRIPTION = "A package for pseudorandomization of DataMatrix objects. That is, it allows \
you to apply certain constraints to the randomization."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.2"

RPM_NAME = "python310-python-pseudorandom-0.2.2-3.6.noarch.rpm"
RPM_HASH = "1f35672677c5e874d35e7ba6158302b1c6c9c67ea7a60360fb27b89b68c3d8ab3b86daf767f3392f6977a0984cdd3fdb24b56cc8bf0a7b68f44bb9da96982d60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-pseudorandom \
python3.10dist(python-pseudorandom) \
python310-python-pseudorandom \
python3dist(python-pseudorandom)"

RDEPENDS:${PN} += "python(abi) \
python310-python-datamatrix"

inherit rpm
