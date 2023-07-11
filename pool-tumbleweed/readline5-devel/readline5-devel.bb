SUMMARY = "Development files for the readline library version 5"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "readline5-devel-5.2-140.4.aarch64.rpm"
RPM_HASH = "3ab12cb29bd3355b2d6051e513abd600996677fbffade18e8c3f571fb2cd59b4c551b73c22942da9fce13d069864e39d7e756825c1a6b98a7aa91d0ded3eb2d5"

RPROVIDES:${PN} += "bash-/usr/lib64/libreadline.a \
readline5-devel"

RDEPENDS:${PN} += "libreadline5 \
ncurses-devel"

inherit rpm
