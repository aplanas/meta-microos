SUMMARY = "Freetype python bindings"
DESCRIPTION = "Freetype python provides bindings for the FreeType library. \
Only the high-level API is bound."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python39-freetype-py-2.3.0-1.3.noarch.rpm"
RPM_HASH = "b05cf3c428038316d412f937373d1980408234162293d8f0ca877f95a3fc24523b0ae93e9d04c4c733df056ee3f9c9b05cda5520bc68b4e2462e9df8d9475990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(freetype-py) \
python39-freetype-py \
python3dist(freetype-py)"

RDEPENDS:${PN} += "freetype2 \
python(abi)"

inherit rpm
