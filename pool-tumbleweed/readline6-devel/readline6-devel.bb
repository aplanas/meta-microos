SUMMARY = "Development files for the readline library version 6"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later"

PV = "6.3"

RPM_NAME = "readline6-devel-6.3-3.4.aarch64.rpm"
RPM_HASH = "4a5bf3c1e319a58a51265820fafec7f76f5a769ccd14913fcd69db062914fc2052093c6340fce08fbbe5d52d17802b34325fcbf999f91c91e0cfe2feddee80e2"

RPROVIDES:${PN} += "bash-/usr/lib64/libreadline.a \
readline6-devel"

RDEPENDS:${PN} += "libreadline6 \
ncurses-devel"

inherit rpm
