SUMMARY = "Tools for configuring the console using X Window System key maps"
DESCRIPTION = "This package provides the console with the same keyboard \
configuration scheme that X Window System has. \
Besides the keyboard, the package also configures the font on the \
console.  It includes a rich collection of fonts and supports \
several languages that would be otherwise unsupported on the \
console (such as Armenian, Georgian, Lao and Thai)."
LICENSE = "GPL-2.0-or-later & MIT & SUSE-Public-Domain"

PV = "1.215"

RPM_NAME = "console-setup-1.215-1.2.noarch.rpm"
RPM_HASH = "36d2cd44d67f017ad020469f69d3e2acd5669aac833df23d84d765840fd7a8bc7c04529e48f8844e29827a4a8e3b0ed1b69c10887d42eeee9405aecc72cb3bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(console-setup) console-setup"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl"

inherit rpm
