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

RPM_NAME = "python39-lml-0.1.0-1.8.noarch.rpm"
RPM_HASH = "825c863e179a50f731ce54dd06a9c93c611980080b2670e3282f320b54ea88077cdd0051bee68a494580a85d26346af867f81c99751c99f5c9611bcaa4870515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lml \
python39-lml \
python3dist-lml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
