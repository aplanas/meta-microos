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

RPM_NAME = "python39-lml-0.1.0-1.6.noarch.rpm"
RPM_HASH = "f6b4c313a14beff5428a9a0cf47cbad543b3d95794b3cb6b63dd472f1e0aed837e4fbb7c509b34fe19f67ad771d1393c4e319ef946bcd2f2d0fc5923570df8c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(lml) \
python39-lml \
python3dist(lml)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
