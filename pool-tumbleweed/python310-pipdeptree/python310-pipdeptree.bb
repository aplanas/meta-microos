SUMMARY = "Command line utility to show dependency tree of packages"
DESCRIPTION = "Command line utility to show dependency tree of packages."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python310-pipdeptree-2.7.1-1.3.noarch.rpm"
RPM_HASH = "6a1150c6ab974f2b8b965627f2daa031d8765bdec74d4ec1bf6d8b4ff3205bb496be8209b729bfe52cf017a872c3f1a8c88f181d2f077f5c17b1b64a5e694cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pipdeptree \
python310-pipdeptree \
python3dist-pipdeptree"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pip \
update-alternatives"

inherit rpm
