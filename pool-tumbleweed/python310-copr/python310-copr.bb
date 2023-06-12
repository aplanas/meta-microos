SUMMARY = "Python client for copr service"
DESCRIPTION = "Python client for copr service."
LICENSE = "GPL-2.0-or-later"

PV = "1.124"

RPM_NAME = "python310-copr-1.124-1.5.noarch.rpm"
RPM_HASH = "f26057021083b03f638f1b9dda92f9dc37447b480911d0c79f691c5118c9ca0bbd3400ecd4be2e7c0651f095618a7f7017e869bb22dc0225b378a98b0e4fd2cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-copr \
python3.10dist(copr) \
python310-copr \
python3dist(copr)"
RDEPENDS:${PN} += "python(abi) \
python310-marshmallow \
python310-munch \
python310-requests \
python310-requests-toolbelt"

inherit rpm
