SUMMARY = "MirBSD Korn Shell"
DESCRIPTION = "The MirBSD Korn Shell is an actively developed free implementation of the Korn \
Shell programming language and a successor to the Public Domain Korn Shell \
(pdksh)."
LICENSE = "MirOS & ISC"

PV = "59c"

RPM_NAME = "mksh-59c-4.3.aarch64.rpm"
RPM_HASH = "d33630eb8e669223e0ca1531240ebeb81c025e8b102c63835c2f301623c1499843ed9d30943a2d4e1abe6c856b86c422ba8aea738d1e005d7eb9f2fba41c3045"

RPROVIDES:${PN} += "/bin/ksh \
mksh \
mksh(aarch-64) \
pdksh"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
update-alternatives"

inherit rpm
