SUMMARY = "Development files for libstrophe"
DESCRIPTION = "Development files and headers for libstrophe"
LICENSE = "GPL-3.0-or-later | MIT"

PV = "0.12.3"

RPM_NAME = "libstrophe-devel-0.12.3-1.1.aarch64.rpm"
RPM_HASH = "b1764ecb8fcc19e54aff123a859d06bf0e7b5f85215dca607cdb99d44a26e276b32410c59ea153570343327257042634678cdebcd97f9b7863bb007639455b6c"

RPROVIDES:${PN} += "libstrophe-devel \
pkgconfig-libstrophe"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstrophe0 \
pkgconfig-libxml-2.0 \
pkgconfig-openssl"

inherit rpm
