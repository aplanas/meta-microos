SUMMARY = "E-Mail Filter"
DESCRIPTION = "This program enables you to convert MIME, SUN mailtool, and 'plain old \
style RFC822'. \
 \
It is especially useful for elm users."
LICENSE = "GPL-2.0+"

PV = "2.1.0beta9"

RPM_NAME = "emil-2.1.0beta9-968.28.aarch64.rpm"
RPM_HASH = "684de0eb1cd80bce9995ef7def477b75001e169923315877b3f138fa970db914ac125e7772f5caeb1c888a2efa52344d62ed055e63515128b33f8ddc0a19d038"

RPROVIDES:${PN} += "config(emil) emil emil(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libresolv.so.2()(64bit) libresolv.so.2(GLIBC_2.17)(64bit)"

inherit rpm
