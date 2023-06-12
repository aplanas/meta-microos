SUMMARY = "Tools for configuring the console using X Window System key maps"
DESCRIPTION = "This package provides the console with the same keyboard \
configuration scheme that X Window System has. \
Besides the keyboard, the package also configures the font on the \
console.  It includes a rich collection of fonts and supports \
several languages that would be otherwise unsupported on the \
console (such as Armenian, Georgian, Lao and Thai)."
LICENSE = "GPL-2.0-or-later & MIT & SUSE-Public-Domain"

PV = "1.220"

RPM_NAME = "console-setup-1.220-1.1.noarch.rpm"
RPM_HASH = "5d0233ffece874d11fec156d40506bb953b9039ae82f3dc1b172489d8a213d9bf87e0da69b1500824ecb1674b82711e78644d4b5311d35270f78d4c74d304a62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(console-setup) console-setup"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl"

inherit rpm
