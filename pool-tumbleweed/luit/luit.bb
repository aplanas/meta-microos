SUMMARY = "Locale and ISO 2022 support for Unicode terminals"
DESCRIPTION = "Luit is a filter that can be run between an arbitrary application and a \
UTF-8 terminal emulator. It will convert application output from the \
locale's encoding into UTF-8, and convert terminal input from UTF-8 into \
the locale's encoding."
LICENSE = "MIT"

PV = "20221028"

RPM_NAME = "luit-20221028-1.2.aarch64.rpm"
RPM_HASH = "bf5f047636826b0c12d93d76d308ec7e8b29733e012b478f7856f8391de33e5bd9f492380031291fb4601641a156c67cab6dfa538cc6e3715fb55ef17857cea2"

RPROVIDES:${PN} += "luit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
