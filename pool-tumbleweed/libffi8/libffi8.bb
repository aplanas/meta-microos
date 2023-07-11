SUMMARY = "Foreign Function Interface Library"
DESCRIPTION = "The libffi library provides a portable, high level programming \
interface to various calling conventions.  This allows a programmer to \
call any function specified by a call interface description at run \
time."
LICENSE = "MIT"

PV = "3.4.4"

RPM_NAME = "libffi8-3.4.4-1.4.aarch64.rpm"
RPM_HASH = "b28dbe8fca7bc5cdbf9abe79b8c1c4db58398eeb6617c00d5e5e75a0b48a49a0f39c759ea701ff4b83bce37671187752fe53326e26cc4f06fbd6d30306eb3eac"

RPROVIDES:${PN} += "libffi.so.8 \
libffi8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
