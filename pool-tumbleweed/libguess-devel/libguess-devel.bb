SUMMARY = "Development package for libguess"
DESCRIPTION = "A high-speed character set detection library \
 \
This package contains the files needed to compile programs that use the \
libguess library."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "libguess-devel-1.2-1.26.aarch64.rpm"
RPM_HASH = "8017715b693c7169d99fd726f1db6c4d1c830da79e585fd41ba2d2876565a34e51280f8d1c3a53c99a15592e6a6887ef056a5e89541d721fe97e009cb8d9876b"

RPROVIDES:${PN} += "libguess-devel \
libguess-devel(aarch-64) \
pkgconfig(libguess)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libguess1 \
libmowgli2-devel \
pkgconf-pkg-config"

inherit rpm
