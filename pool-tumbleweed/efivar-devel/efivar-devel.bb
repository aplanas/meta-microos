SUMMARY = "Development headers for libefivar"
DESCRIPTION = "Development headers required to use libefivar."
LICENSE = "LGPL-2.1-only"

PV = "38"

RPM_NAME = "efivar-devel-38-1.3.aarch64.rpm"
RPM_HASH = "dd207c735bb1e27a88eccb485ed6f82bd8e1eaf0eff5889501a80ea2f87c289e602a6982a0c9d23767cca7c5a8d5fa7dd2d5aedc2279e81c24fcd93baff80fd4"

RPROVIDES:${PN} += "efivar-devel \
efivar-devel(aarch-64) \
pkgconfig(efiboot) \
pkgconfig(efisec) \
pkgconfig(efivar)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libefivar1 \
pkgconfig(efivar)"

inherit rpm
