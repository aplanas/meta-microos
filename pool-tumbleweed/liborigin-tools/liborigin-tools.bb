SUMMARY = "Converter for OriginLab OPJ project files"
DESCRIPTION = "Converter for OriginLab OPJ project files. \
Features: \
* reads any worksheets with all columns \
* supports 4.1, 5.0, 6.0, 6.1, 7.0, 7.5 projects"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "liborigin-tools-3.0.1-1.10.aarch64.rpm"
RPM_HASH = "a8bfeed54892e6f8b4bfb1ee2224de8f6d19edc5bc85662f6ca673a185747f80f92ebe794eabe754b148c56922af4070071201f2ad90bc07747dfba458c22a04"

RPROVIDES:${PN} += "liborigin-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
liborigin.so.3 \
libstdc++.so.6"

inherit rpm
