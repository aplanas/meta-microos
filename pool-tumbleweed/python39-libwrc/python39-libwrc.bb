SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python39-libwrc-20230318-1.4.aarch64.rpm"
RPM_HASH = "6ade2834ce2e3167aff030a62f58620c9d4155ac55fccd11f1154187e629016c5e071af083cf3b9ba75d26db7108255eb03c8e605a132c697beeab65a6ea7ccd"

RPROVIDES:${PN} += "python39-libwrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libwrc.so.1 \
python-abi"

inherit rpm
