SUMMARY = "Limited cdrecord Compatibility Wrapper"
DESCRIPTION = "cdrskin is a limited cdrecord compatibility wrapper which allows to use most of \
the libburn features from the command line."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "cdrskin-1.5.6-2.1.aarch64.rpm"
RPM_HASH = "ae3aefcb10e7cc6cef2745bd9f9bfef14b1dc4265888a98efe0352cc0ba990f3697287f868f79ea9aee92621e2df427a94157e9e2ff52643bf3860479c4bf250"

RPROVIDES:${PN} += "cdrskin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libburn.so.4 \
libc.so.6"

inherit rpm
