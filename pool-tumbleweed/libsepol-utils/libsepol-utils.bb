SUMMARY = "SELinux binary policy manipulation tools"
DESCRIPTION = "libsepol provides an API for the manipulation of SELinux binary \
policies. It is used by checkpolicy (the policy compiler) and similar \
tools, as well as by programs like load_policy that need to perform \
specific transformations on binary policies such as customizing \
policy boolean settings."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsepol-utils-3.5-1.5.aarch64.rpm"
RPM_HASH = "ea0c9547ee24df7c4cbad04928dbf024c19f524659270ea519584229c086e531babe84ef9fe38ce02aeadf07b69dba91dd82d8659db7cd400ca1210d29cf50a9"

RPROVIDES:${PN} += "libsepol-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsepol.so.2"

inherit rpm
