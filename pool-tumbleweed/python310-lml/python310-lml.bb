SUMMARY = "A lazy plugin management system for Python"
DESCRIPTION = "LML is 'Load me later'. lml seamlessly finds the lml-based \
plugins from the current Python environment but loads plugins on \
demand. It supports plugins that have external dependencies, \
especially bulky and/or memory hungry ones. lml provides the plugin \
management system only and the plugin interface is for the developer \
to do. \
 \
Plugins loaded by lml may be installed packages or standalone \
Python modules in a supplied directory."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python310-lml-0.1.0-1.8.noarch.rpm"
RPM_HASH = "ea04b3c395f42a1b9bc57428eae64476f6a2939144232bb68b23b68821a9e7725d99aa94e1c3272f952cb6bdd0e7e8c0df339ec10fb26a0f084138c895d79a07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lml \
python310-lml \
python3dist-lml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
