SUMMARY = "The Ultimate Packer for eXecutables"
DESCRIPTION = "UPX is a compressor for several different executable formats. \
Programs receive a stub that makes them self-runnable. When run, \
decompression either happens in memory in-place if possible, or to a \
temporary file, the latter of which does not support setuid programs, \
or the proper name in argv[0]."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.2"

RPM_NAME = "upx-4.0.2-1.4.aarch64.rpm"
RPM_HASH = "25e7ffa39a3eead64de8d506ef1428a6c3896008c47c29d1a4e9fbdbf312c1b559bafb124fc535a8218b848da1d1c034447be503e04a4a12a29a054ea7425ca4"

RPROVIDES:${PN} += "upx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
