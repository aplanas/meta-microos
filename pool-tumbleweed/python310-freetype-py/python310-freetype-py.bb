SUMMARY = "Freetype python bindings"
DESCRIPTION = "Freetype python provides bindings for the FreeType library. \
Only the high-level API is bound."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python310-freetype-py-2.3.0-1.5.noarch.rpm"
RPM_HASH = "75780113f080a922c3b5f1d466f93ed1d3ef7d1432f0d58316fc4f43edc73587f3bc171af4a67f729fd177a24cfe8c2089dca49c88fde171a67fa2a28c22e954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-freetype-py \
python310-freetype-py \
python3dist-freetype-py"

RDEPENDS:${PN} += "freetype2 \
python-abi"

inherit rpm
