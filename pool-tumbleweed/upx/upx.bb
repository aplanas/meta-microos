SUMMARY = "The Ultimate Packer for eXecutables"
DESCRIPTION = "UPX is a compressor for several different executable formats. \
Programs receive a stub that makes them self-runnable. When run, \
decompression either happens in memory in-place if possible, or to a \
temporary file, the latter of which does not support setuid programs, \
or the proper name in argv[0]."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "upx-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "d360ec270607a81b236c295a0b2a9a6776554e97c434be7641ffb6c2430a6107d6f6031b20a453a515197469c86adbcbe96c8a76d006d5d37ca05ad2c658a3a9"

RPROVIDES:${PN} += "upx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
