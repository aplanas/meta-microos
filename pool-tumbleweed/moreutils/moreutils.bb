SUMMARY = "Additional Unix Utilities"
DESCRIPTION = "This is a growing collection of the Unix tools that nobody thought to write long ago, when Unix was young. \
 \
So far, it includes the following utilities: \
 \
  - chronic: runs a command quietly unless it fails \
  - combine: combine the lines in two files using boolean operations \
  - errno: look up errno names and descriptions \
  - ifdata: get network interface info without parsing ifconfig output \
  - ifne: run a program if the standard input is not empty \
  - isutf8: check if a file or standard input is utf-8 \
  - lckdo: execute a program with a lock held \
  - mispipe: pipe two commands, returning the exit status of the first \
  - parallel: run multiple jobs at once \
  - pee: tee standard input to pipes \
  - sponge: soak up standard input and write to a file \
  - ts: timestamp standard input \
  - vidir: edit a directory in your text editor \
  - vipe: insert a text editor into a pipe \
  - zrun: automatically uncompress arguments to command \
 \
The `moreutils` package includes errno, ifdata, ifne, isutf8, lckdo, mispipe, pee and sponge. \
The remaining programs are included in the `moreutils-parallel`, `moreutils-perl`, `chronic` and `ts` packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & (GPL-2.0-or-later | MIT) & BSD-2-Clause & SUSE-Public-Domain"

PV = "0.67"

RPM_NAME = "moreutils-0.67-2.3.aarch64.rpm"
RPM_HASH = "64ce8b15810b4d664b1daa9a98403cb4c3f6680aef3e8f8c2df0911a766082f01d01deffe665e7659fcab2730f9e9bfd29f357676a090a02e7115d8f7d6d04ff"

RPROVIDES:${PN} += "moreutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
