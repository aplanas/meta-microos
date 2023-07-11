SUMMARY = "Freetype python bindings"
DESCRIPTION = "Freetype python provides bindings for the FreeType library. \
Only the high-level API is bound."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python311-freetype-py-2.3.0-1.5.noarch.rpm"
RPM_HASH = "f53aae2205b68462710b55ee49e2de2d605f7daeefbd5375b26b4068f535a07945032f6b2a95365f176f6c32f2c646a3c9fd62f32410e620484a981090b1e4bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-freetype-py \
python3.11dist-freetype-py \
python311-freetype-py \
python3dist-freetype-py"

RDEPENDS:${PN} += "freetype2 \
python-abi"

inherit rpm
