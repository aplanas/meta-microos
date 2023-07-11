SUMMARY = "Wrapper library around libffmpeg"
DESCRIPTION = "FFmpegSource (usually known as FFMS or FFMS2) is a wrapper \
library around FFmpeg, plus some additional components to deal with file \
formats libavformat has (or used to have) problems with."
LICENSE = "MIT"

PV = "2.40+44"

RPM_NAME = "ffmsindex-2.40+44-1.6.aarch64.rpm"
RPM_HASH = "3fbf2953504584111b1a87af5cecbb6405da69335d6c99893423cfa114d306059cbef9d4c2f98a874c096593f937a7087acdecf62cdb35c99b25be8ae83ef1dd"

RPROVIDES:${PN} += "ffmsindex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffms2.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
