SUMMARY = "Module for the development of flexible plugin systems"
DESCRIPTION = "PluginBase is a module for Python that enables the development of \
flexible plugin systems."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python310-pluginbase-1.0.1-1.8.noarch.rpm"
RPM_HASH = "81b190ce609b82612cc288a9f5df12769dfbbbf5995e1f743c6df3388678807e4e5d8f111470696db676411fa6feb50d0b4b4f70c2ac8f8a35359cf5fb451b2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pluginbase \
python3.10dist-pluginbase \
python310-pluginbase \
python3dist-pluginbase"

RDEPENDS:${PN} += "python-abi"

inherit rpm
