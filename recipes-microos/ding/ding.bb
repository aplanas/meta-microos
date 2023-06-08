SUMMARY = "An X Window System Dictionary Tool"
DESCRIPTION = "Ding is a graphical frontend to an English-to-German dictionary \
lookup and word spell checking. For full functionality, agrep and \
ispell should be installed."
LICENSE = "GPL-2.0-or-later"

PV = "1.9"

RPM_NAME = "ding-1.9-2.2.noarch.rpm"
RPM_HASH = "729f2ff8d99318f08abb6b791c51d6670d91b2e2a760d1738eb23871af439dd50162c0a6d9a6ea40c71453a600ac9336a3a0ef67e1bb533e020573afdb887866"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(ding.desktop) ding"
RDEPENDS:${PN} += "/bin/sh ding-dict-de_en tcl tk"

inherit rpm
