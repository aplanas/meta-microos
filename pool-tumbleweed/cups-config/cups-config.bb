SUMMARY = "CUPS library configuration files"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. \
 \
This subpackage contains some basic configuration files for its \
operation."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "cups-config-2.4.2-6.1.aarch64.rpm"
RPM_HASH = "114327e97b59be1bae81b620d909c7785bbf975bc838788c6cb15ca3dd95c59b5ee38f47b002b27fa294dfef3b14bf87bbb2151e923cb9c94fb31ae95d3dc7e3"

RPROVIDES:${PN} += "config-cups-config \
cups-config"

RDEPENDS:${PN} += "/usr/bin/sh \
group-lp \
user-lp"

inherit rpm
