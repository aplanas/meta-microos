SUMMARY = "The Ultimate Packer for eXecutables"
DESCRIPTION = "UPX is a compressor for several different executable formats. \
Programs receive a stub that makes them self-runnable. When run, \
decompression either happens in memory in-place if possible, or to a \
temporary file, the latter of which does not support setuid programs, \
or the proper name in argv[0]."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.2"

RPM_NAME = "upx-4.0.2-1.3.aarch64.rpm"
RPM_HASH = "e62276a546d926423961b6ed9acb149bfbe8bce7299b580ef27186f8559c63af9d56a45cef97e2bc02c73c3cfb803ce672cd69d2d8e864e70ac2a097d79c29c8"

RPROVIDES:${PN} += "upx \
upx(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
