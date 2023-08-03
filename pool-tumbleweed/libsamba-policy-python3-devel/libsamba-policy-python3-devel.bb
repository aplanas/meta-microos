SUMMARY = "Development files for the Samba AD Group Policy library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libsamba-policy."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "libsamba-policy-python3-devel-4.18.5+git.313.c8e274c7852-1.1.aarch64.rpm"
RPM_HASH = "bd6423ac2be4b208ef14bce4605cb6ec27ab723945151cf088b856581324c1eb118d1c0cb5227a67b5d28ea0f4888c60d9ea2fdddf94717ab6315a91e4d2896c"

RPROVIDES:${PN} += "libsamba-policy-python3-devel \
pkgconfig-samba-policy.cpython-311-aarch64-linux-gnu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsamba-policy0-python3 \
pkgconfig-ldb \
pkgconfig-talloc"

inherit rpm
