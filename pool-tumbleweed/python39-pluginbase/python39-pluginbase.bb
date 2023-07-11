SUMMARY = "Module for the development of flexible plugin systems"
DESCRIPTION = "PluginBase is a module for Python that enables the development of \
flexible plugin systems."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python39-pluginbase-1.0.1-1.10.noarch.rpm"
RPM_HASH = "2b5802259ff8baabd8ef5ba44a1f5927dd1dd516721fbda7de7a41f87f1a363c1f56b0925353c61b6eadc429a452c485bee23626f01e1a380abd7d253a619840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pluginbase \
python39-pluginbase \
python3dist-pluginbase"

RDEPENDS:${PN} += "python-abi"

inherit rpm
