SUMMARY = "Tool for Merging Config Files"
DESCRIPTION = "fillup merges files that hold variables.  A variable is defined by an \
entity composed of a preceding comment, a variable name, an assignment \
delimiter, and a related variable value.  A variable is determined by \
its variable name."
LICENSE = "GPL-2.0-or-later"

PV = "1.42"

RPM_NAME = "fillup-1.42-279.2.aarch64.rpm"
RPM_HASH = "5880e99a440b61a878e7805fe149fc3a946ca13764eb85ec73e9fbe5129f97630cd67ef7e268cf6671782c305892182d270c681aa41e14654dca7a7caef0215b"

RPROVIDES:${PN} += "aaa_base:/bin/fillup \
fillup \
fillup(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
