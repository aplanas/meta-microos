SUMMARY = "A Program for Compressing Files with the Lempel–Ziv–Markov algorithm"
DESCRIPTION = "The xz command is a program for compressing files. \
* Average compression ratio of LZMA is about 30% better than that of \
  gzip, and 15% better than that of bzip2. \
* Decompression speed is only little slower than that of gzip, being \
  two to five times faster than bzip2. \
* In fast mode, compresses faster than bzip2 with a comparable \
  compression ratio. \
* Achieving the best compression ratios takes four to even twelve \
  times longer than with bzip2. However, this does not affect \
  decompressing speed. \
* Very similar command line interface to what gzip and bzip2 have."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "5.4.3"

RPM_NAME = "xz-5.4.3-1.3.aarch64.rpm"
RPM_HASH = "9da1f2ced78e297eca0253adb224ed249ceb03ea300c60e178a04dc4d0e69f385818121c480e243ec04ba588cdde25ef66fab0962f81f77d86f99b793e56ae1c"

RPROVIDES:${PN} += "lzma \
xz"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5"

inherit rpm
