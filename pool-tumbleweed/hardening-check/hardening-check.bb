SUMMARY = "A tool for inspecting low-level hardening characteristics of ELF binaries"
DESCRIPTION = "This package contains a Perl script that allows checking \
a number of hardening characteristics of ELF binaries. \
 \
This includes checks for PIE executables, stack protection, source \
fortification, read-only relocations and immediate binding."
LICENSE = "GPL-2.0+"

PV = "2.6"

RPM_NAME = "hardening-check-2.6-3.19.aarch64.rpm"
RPM_HASH = "d862bcb595de4e72bd23634ae6fd2d517e95e3c19ef3c4802a0ecb3d1c71333620f44dc5041cb2f7de9059ad9feed97c1f6eb8bd0d3ef9347a31c04e7b9d774d"

RPROVIDES:${PN} += "hardening-check"

RDEPENDS:${PN} += "/usr/bin/perl \
perl"

inherit rpm
