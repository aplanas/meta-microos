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

PV = "5.4.4"

RPM_NAME = "xz-5.4.4-2.1.aarch64.rpm"
RPM_HASH = "2e9c2b3cddc4e285920e4fda19b702acd386324559e8ac182121ed56101641e50ea443c7597a00b0e794b00463648c3242d2aa5cbe7e41bf8aaa7592e1720173"

RPROVIDES:${PN} += "lzma \
xz"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5"

inherit rpm
