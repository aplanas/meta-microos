SUMMARY = "Russian Charset Detection Library"
DESCRIPTION = "librcd is a library for automatic encoding detection of \
Russian/Ukrainian language texts. It is optimized for very small \
words and phrases."
LICENSE = "LGPL-2.1+"

PV = "0.1.14"

RPM_NAME = "librcd0-0.1.14-4.27.aarch64.rpm"
RPM_HASH = "a2dd37d1e7f76c8656a5b2a71ba99284fc15b3ca532bd98d0e674216e72c96feb68f174dc44c6571ec0bef6db76feb3c5640645cb8a3ec000ee95721a8a5a048"

RPROVIDES:${PN} += "librcd.so.0 \
librcd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
