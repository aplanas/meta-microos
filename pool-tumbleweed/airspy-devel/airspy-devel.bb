SUMMARY = "Development files for airspy"
DESCRIPTION = "Library headers for airspy driver."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "airspy-devel-1.0.10-1.9.aarch64.rpm"
RPM_HASH = "04f315a38ce42b9f0191ae04c7cde26bb9c45874a9ca92fe695f1e394232d4dca704320789b160fe286039d81da5b671f1b1e9fde2ca5b6bd7fda0e8869ee90f"

RPROVIDES:${PN} += "airspy-devel \
pkgconfig-libairspy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libairspy0"

inherit rpm
