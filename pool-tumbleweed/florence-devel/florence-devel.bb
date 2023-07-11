SUMMARY = "Development files for florence"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use florence."
LICENSE = "GPL-2.0-or-later & GFDL-1.2-only"

PV = "0.6.3"

RPM_NAME = "florence-devel-0.6.3-5.11.aarch64.rpm"
RPM_HASH = "f02f6d12d653aae4dd04a345a1a72ff98e14dac17c00db65cc1d74fadbc0cae2345ecce61d134f5dc49b68d10a158c6a8578a136dca524481d7dd8b48070396f"

RPROVIDES:${PN} += "florence-devel \
pkgconfig-florence-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
florence \
pkgconfig-gio-2.0"

inherit rpm
