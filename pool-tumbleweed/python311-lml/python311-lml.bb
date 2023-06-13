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

RPM_NAME = "python311-lml-0.1.0-1.6.noarch.rpm"
RPM_HASH = "38e6669415e517ac019eb35029550f1e3d63966dbd2ca3acc90727d4a442fa333dcc8abc4b02639d6ab5d79c8bf3c2e2fe92677fad0118a5df0c47eadd797c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(lml) \
python311-lml \
python3dist(lml)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
