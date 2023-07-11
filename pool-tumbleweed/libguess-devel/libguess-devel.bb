SUMMARY = "Development package for libguess"
DESCRIPTION = "A high-speed character set detection library \
 \
This package contains the files needed to compile programs that use the \
libguess library."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "libguess-devel-1.2-1.27.aarch64.rpm"
RPM_HASH = "ae7718662c610adfea20e228e44da233e1ce760e05783854db7e3e7d144743b7dacc1144937d75ad0edb5347226139fad2f86a09a167851b4f69641c942fa16b"

RPROVIDES:${PN} += "libguess-devel \
pkgconfig-libguess"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libguess1 \
libmowgli2-devel \
pkg-config"

inherit rpm
