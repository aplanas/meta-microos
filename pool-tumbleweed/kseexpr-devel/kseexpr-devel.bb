SUMMARY = "Development files for kseexpr"
DESCRIPTION = "Development headers and libraries for kseexpr."
LICENSE = "GPL-3.0-or-later & Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.0.4.0"

RPM_NAME = "kseexpr-devel-4.0.4.0-1.11.aarch64.rpm"
RPM_HASH = "db024162d5f6d509a403a8d1608f7b354315c88cb9dd810b01a3b2ec24e233887e21681193db8d59c4d42fe5f3a6c2637031ed6657767c04612a89f1b851c36a"

RPROVIDES:${PN} += "cmake-kseexpr \
kseexpr-devel \
pkgconfig-kseexpr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libKSeExpr4"

inherit rpm
