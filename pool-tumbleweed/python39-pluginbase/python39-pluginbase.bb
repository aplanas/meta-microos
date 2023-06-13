SUMMARY = "Module for the development of flexible plugin systems"
DESCRIPTION = "PluginBase is a module for Python that enables the development of \
flexible plugin systems."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python39-pluginbase-1.0.1-1.8.noarch.rpm"
RPM_HASH = "b35bb955c81d067396356e8f12d3f98e956824d9c77bf37c034211294ce9b0a7d354407b05cb0f945e50689b45f7376c76069bbd514112adde55f278e11ccf9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pluginbase) \
python39-pluginbase \
python3dist(pluginbase)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
