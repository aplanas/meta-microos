SUMMARY = "Devel files for the fish shell"
DESCRIPTION = "This package contains development files for the fish shell."
LICENSE = "GPL-2.0-only"

PV = "3.6.1"

RPM_NAME = "fish-devel-3.6.1-1.1.aarch64.rpm"
RPM_HASH = "7f15956d42bb10f190e227ed28feead4d4a19f03ef199af95814da9333dd527a6fa7c935e10d9f4a950f94990cce9885dd3cd9684f43071074da9ca783fdbb68"

RPROVIDES:${PN} += "fish-devel \
pkgconfig-fish"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
