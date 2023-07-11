SUMMARY = "Freetype python bindings"
DESCRIPTION = "Freetype python provides bindings for the FreeType library. \
Only the high-level API is bound."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python39-freetype-py-2.3.0-1.5.noarch.rpm"
RPM_HASH = "f4231025a0c74c28518eba34f6c4e18ba0fdb614c5b8670eaaf144a85e5e80b8cff425305179221bd37a20b140901f70c19d02ffe27e71008dd4fd54ebeeceb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-freetype-py \
python39-freetype-py \
python3dist-freetype-py"

RDEPENDS:${PN} += "freetype2 \
python-abi"

inherit rpm
