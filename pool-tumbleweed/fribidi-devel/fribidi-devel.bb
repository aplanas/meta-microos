SUMMARY = "Development Files for FriBiDi"
DESCRIPTION = "This package provides headers and manual files for FriBiDi."
LICENSE = "LGPL-2.1-only"

PV = "1.0.13"

RPM_NAME = "fribidi-devel-1.0.13-1.1.aarch64.rpm"
RPM_HASH = "084172704b3f94eed32212c65e0adc25b8b3a2893165a50567e7238e3877b2f13c26a0d71ed148f71f0f14608b4f45ad39811960c6f068266be7c23bd9b52d24"

RPROVIDES:${PN} += "fribidi-devel \
pkgconfig-fribidi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfribidi0"

inherit rpm
