SUMMARY = "A drop in replacement for xpyb, an XCB python binding"
DESCRIPTION = "The xcffib package is intended to be a (mostly) drop-in \
replacement for xpyb."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python310-xcffib-1.3.0-1.1.noarch.rpm"
RPM_HASH = "8d92192f58faaa4113a6e51847609f3e39d18845d19836da3076c076721fe769c4fb7314d8eb9fdd9e27af213030cff9bd34a582858f98fd993300fe227495fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xcffib \
python3.10dist(xcffib) \
python310-xcffib \
python3dist(xcffib)"

RDEPENDS:${PN} += "python(abi) \
python310-cffi"

inherit rpm
