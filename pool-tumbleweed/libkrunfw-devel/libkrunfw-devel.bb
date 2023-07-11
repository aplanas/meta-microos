SUMMARY = "Header files and libraries for libkrunfw development"
DESCRIPTION = " \
libkrunfw is a library bundling a Linux kernel in a dynamic library \
in a way that can be easily consumed by libkrun. \
By having the kernel bundled in a dynamic library, libkrun can leave to \
the linker the work of mapping the sections into the process, and then \
directly inject those mappings into the guest without any kind of additional \
work nor processing. \
 \
This package contains the libraries needed to develop programs \
that consume the guest payload integrated in libkrunfw."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.8.1"

RPM_NAME = "libkrunfw-devel-3.8.1-1.6.aarch64.rpm"
RPM_HASH = "7cdb9df54b9c7e9f0bc54057587b6b653fadc664236cf44c283539fe36614a9db4a6bd39b7ebe2f4c3babc7bacc9ba3bf2d16f3efcef529b0b9ce7f52473c458"

RPROVIDES:${PN} += "libkrunfw-devel"

RDEPENDS:${PN} += "libkrunfw3"

inherit rpm
