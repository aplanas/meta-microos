SUMMARY = "Header and library definition files for lensfun"
DESCRIPTION = "Header and library definition files for developing applications \
that use the lensfun library/database."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.4"

RPM_NAME = "lensfun-devel-0.3.4-1.1.aarch64.rpm"
RPM_HASH = "8ccad46e72cec0189aaac6f78d7b6acbb276474bf450b6adaafa85575ead444b30b3c17cc06b0f160a6faba8bae0a439e3908854b63f6f6bd092b4d200e9a864"

RPROVIDES:${PN} += "lensfun-devel \
pkgconfig-lensfun"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lensfun-data \
liblensfun1 \
pkgconfig-glib-2.0"

inherit rpm
