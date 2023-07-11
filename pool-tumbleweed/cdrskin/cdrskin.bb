SUMMARY = "Limited cdrecord Compatibility Wrapper"
DESCRIPTION = "cdrskin is a limited cdrecord compatibility wrapper which allows to use most of \
the libburn features from the command line."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "cdrskin-1.5.6-1.1.aarch64.rpm"
RPM_HASH = "41357247d498457605c235579736e83177e50cf8b039005443bb9f38f3ebbb75c0817efae618f387cdc54e2dd75d4c797599a8029412a030576cb3547d3e0d6e"

RPROVIDES:${PN} += "cdrskin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libburn.so.4 \
libc.so.6"

inherit rpm
