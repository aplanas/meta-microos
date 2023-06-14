SUMMARY = "MPEG audio decoder and player"
DESCRIPTION = "madplay is a command-line MPEG audio decoder and player based on the MAD \
library (libmad)."
LICENSE = "GPL-2.0-or-later"

PV = "0.15.2b"

RPM_NAME = "madplay-0.15.2b-2.15.aarch64.rpm"
RPM_HASH = "2ee59c3e5c75187a72c007cfee8a5fb907da0ce2c94cb4c88de732f63c4409b29b107913ac29caa24e0586a34426a6273b74bae950ac81be141cda62145e5656"

RPROVIDES:${PN} += "madplay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libid3tag.so.0.16.2 \
libm.so.6 \
libmad.so.0"

inherit rpm
