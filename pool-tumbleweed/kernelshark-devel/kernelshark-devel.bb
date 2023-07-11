SUMMARY = "Development files for kernelshark"
DESCRIPTION = "Development files for kernelshark"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.2.0"

RPM_NAME = "kernelshark-devel-2.2.0-1.4.aarch64.rpm"
RPM_HASH = "f0b2df82a430c340ff91979e4a545bab1fbead2db7e0d983521a023ff62c6b15da92efe055d8cdf79aefba4e1a6c3333955f02af6c13c77f97941bea45309d3f"

RPROVIDES:${PN} += "kernelshark-devel \
pkgconfig-libkshark"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
kernelshark \
pkgconfig-json-c \
pkgconfig-libtracecmd"

inherit rpm
