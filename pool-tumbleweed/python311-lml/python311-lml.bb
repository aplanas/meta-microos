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

RPM_NAME = "python311-lml-0.1.0-1.8.noarch.rpm"
RPM_HASH = "5f2e1ab8d5b50bbb357b7ebb4a2f814fec37a3131313742024d1fc694aeeafab9574ce051914c5962b4eaca1778b29ada422d54b5c8fe3e98eeefa497c38b9ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lml \
python3.11dist-lml \
python311-lml \
python3dist-lml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
