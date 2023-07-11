SUMMARY = "Module for the development of flexible plugin systems"
DESCRIPTION = "PluginBase is a module for Python that enables the development of \
flexible plugin systems."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python310-pluginbase-1.0.1-1.10.noarch.rpm"
RPM_HASH = "c9e7ac160ead9d35c5fe3eb92d718f829f9098987e359c18b6d49dd4990de4f5172cf344b9cb90db2f800f3d5471db5df3eae00cadcf24cc34b52754a35919b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pluginbase \
python310-pluginbase \
python3dist-pluginbase"

RDEPENDS:${PN} += "python-abi"

inherit rpm
