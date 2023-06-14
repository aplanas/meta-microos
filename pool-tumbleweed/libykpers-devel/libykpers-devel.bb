SUMMARY = "Development files for the ykpers library"
DESCRIPTION = "Yubico's YubiKey can be re-programmed. This project provides a reference implementation for configuration of YubiKeys."
LICENSE = "BSD-2-Clause"

PV = "1.20.0"

RPM_NAME = "libykpers-devel-1.20.0-3.7.aarch64.rpm"
RPM_HASH = "a4c3c61110ce79e4a5b1bb6a00c4aa64609e6b3942c64c086fd6aa1870db6171ca0f9519520d8955e5328575a98449b4a971372e7a037db3c28c0c2f6e7a1392"

RPROVIDES:${PN} += "libykpers-devel \
pkgconfig-ykpers-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libykpers-1-1"

inherit rpm
