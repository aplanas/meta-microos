SUMMARY = "Module for the development of flexible plugin systems"
DESCRIPTION = "PluginBase is a module for Python that enables the development of \
flexible plugin systems."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python311-pluginbase-1.0.1-1.8.noarch.rpm"
RPM_HASH = "d4eae59bb0150bade9178c3d8adb92bf427e931ee077a3d55b67b1bf81ca2213f6ad9c7bfb1522cdf4210385f1ca21a9a3ad92833e18fcb76db5e918d595a1fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pluginbase) \
python311-pluginbase \
python3dist(pluginbase)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
