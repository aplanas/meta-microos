SUMMARY = "A modern CSS selector implementation for BeautifulSoup"
DESCRIPTION = "A modern CSS selector implementation for BeautifulSoup"
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python310-soupsieve-2.4.1-1.1.noarch.rpm"
RPM_HASH = "dd8299f534b97248e8eca9ce9a73cdd5b87a3dcd574f5aabb342c66e5f3d82625032c2724d23ba6c16854c0f909817a88c4b0565744dc491813c00183e4ca6e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-soupsieve \
python3.10dist(soupsieve) \
python310-soupsieve \
python3dist(soupsieve)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
