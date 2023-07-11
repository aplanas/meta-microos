SUMMARY = "A utility for finding files by name"
DESCRIPTION = "A new locate implementation. The m character \
stands for merging, because updatedb reuses the \
existing database to avoid re-reading most of the \
file system."
LICENSE = "GPL-2.0-only"

PV = "0.26"

RPM_NAME = "mlocate-0.26-33.2.aarch64.rpm"
RPM_HASH = "ad452ccde906988be763f1543b599f84fde39c47a8549865749d7a5ff143c00e56944993ef7f59ea4ff10f5a1ba869fd16b3e6007147ce0d7dba25b0c6a11c28"

RPROVIDES:${PN} += "config-mlocate \
findutils-/usr/bin/locate \
findutils-locate \
mlocate"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
apparmor-abstractions \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
user-nobody"

inherit rpm
