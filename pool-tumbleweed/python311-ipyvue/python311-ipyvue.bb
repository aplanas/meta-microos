SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "python311-ipyvue-1.9.1-1.1.noarch.rpm"
RPM_HASH = "4ee1e2bab6568940e7e4936cf51f655b44f4690890340492544248dfb658ace09bc0aadbfc396f78eb65cec9bc3115eb8ce244d2adf0020b7e72ac62c54084c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipyvue) \
python311-ipyvue \
python3dist(ipyvue)"
RDEPENDS:${PN} += "python(abi) \
python311-ipywidgets"

inherit rpm
