SUMMARY = "Module for the development of flexible plugin systems"
DESCRIPTION = "PluginBase is a module for Python that enables the development of \
flexible plugin systems."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python311-pluginbase-1.0.1-1.10.noarch.rpm"
RPM_HASH = "b9dbfabdf990a9d2b3d446609f947ade4ad309f83c740d88fa9f35d5df2b1ea791fc5b1dfae35fb16ef64bc89dc1bf1cb0acc4b8d1a75a4205cd5b48225ddf9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pluginbase \
python3.11dist-pluginbase \
python311-pluginbase \
python3dist-pluginbase"

RDEPENDS:${PN} += "python-abi"

inherit rpm
