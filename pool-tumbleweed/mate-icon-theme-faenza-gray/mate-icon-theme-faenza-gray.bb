SUMMARY = "MATE Desktop faenza compilation theme, grey variant"
DESCRIPTION = "This icon theme uses Faenza and Faience icon themes by ~Tiheum and \
some icons customised for MATE by Rowen Stipe. Also, there are some \
icons from Mint-X-F and Faenza-Fresh icon packs."
LICENSE = "GPL-3.0-only"

PV = "1.20.0"

RPM_NAME = "mate-icon-theme-faenza-gray-1.20.0-1.12.noarch.rpm"
RPM_HASH = "f3d635bccc072626e53bc3cd441947aed1bc058574287744565083392459036d743c6d72806a9443d05f1d86b3ff030b1516d8ab17109a9064e8500da7514f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-icon-theme-faenza-gray"
RDEPENDS:${PN} += "mate-icon-theme-faenza"

inherit rpm
