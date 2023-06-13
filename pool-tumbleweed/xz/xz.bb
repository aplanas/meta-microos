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

RPM_NAME = "xz-5.4.3-1.1.aarch64.rpm"
RPM_HASH = "2455a8bf1bcbed4638aa883cf7935b54c67b0b2c4670a88064b8e69e2317cc37b8202693a4af660af4e503c197f61dbbc1990efe5f0e70965705934437fe9435"

RPROVIDES:${PN} += "lzma \
xz \
xz(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblzma.so.5()(64bit)"

inherit rpm
