SUMMARY = "MATE Desktop Faenza compilation theme"
DESCRIPTION = "This icon theme uses Faenza and Faience icon themes by ~Tiheum and \
some icons customised for MATE by Rowen Stipe. Also, there are some \
icons from Mint-X-F and Faenza-Fresh icon packs."
LICENSE = "GPL-3.0-only"

PV = "1.20.0"

RPM_NAME = "mate-icon-theme-faenza-1.20.0-1.12.noarch.rpm"
RPM_HASH = "b5325076eea42670d3131c1bf64c0956c470905c9eb4c00aaab92385f180077cdd1ebec2dc1b37b9620ef12cd394a2237c3dec8cac1869f2abfd3441a71822de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-icon-theme-faenza"

RDEPENDS:${PN} += ""

inherit rpm
