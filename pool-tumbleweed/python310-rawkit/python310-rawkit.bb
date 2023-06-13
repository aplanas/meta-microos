SUMMARY = "CTypes based LibRaw bindings"
DESCRIPTION = "The rawkit (pronounced rocket) module is a ctypes-based LibRaw \
binding for Python inspired by the Wand API."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-rawkit-0.6.0-3.5.noarch.rpm"
RPM_HASH = "2a40e1a867b94c6bae80b253e96528af672ba6e7519bc004bac019137ab6d1e0a88b65cd0a016203da778444846b0c4d51c82b397aca06587d8199f2a40f2b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rawkit \
python3.10dist(rawkit) \
python310-rawkit \
python3dist(rawkit)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
