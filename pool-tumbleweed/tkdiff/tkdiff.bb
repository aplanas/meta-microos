SUMMARY = "2 and 3-way diff/merge tool"
DESCRIPTION = "TkDiff is a graphical 2 and 3-way diff/merge tool."
LICENSE = "GPL-2.0-or-later"

PV = "5.6"

RPM_NAME = "tkdiff-5.6-1.2.noarch.rpm"
RPM_HASH = "c31082b920a96d68fabc58bc3475a01d517b8d4f27e065acfd1a6fc602d3596260c60545554916d007ccaa8c1ddf0d2bd91ff46db50daf92c7b32a6958c77a95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tkdiff"
RDEPENDS:${PN} += "/bin/sh \
diffutils \
tcl \
tk"

inherit rpm
