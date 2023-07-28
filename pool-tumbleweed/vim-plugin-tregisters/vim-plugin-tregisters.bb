SUMMARY = "List, edit, and run/execute registers/clipboards"
DESCRIPTION = "List, edit, and run or execute registers and/or clipboards"
LICENSE = "GPL-1.0-or-later"

PV = "0.2"

RPM_NAME = "vim-plugin-tregisters-0.2-56.1.noarch.rpm"
RPM_HASH = "95a4516c9d3206b31bd1c2f4a266acc7ddfa60f33d132e1fc58c31341de52110d2ccc5111ab83596b992759f21aa26e0f073b287b3daa10db0bda9c80df4b232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-tregisters"

RDEPENDS:${PN} += "vim \
vim-plugin-tlib"

inherit rpm
