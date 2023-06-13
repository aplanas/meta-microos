SUMMARY = "Development Files for the Last.fm Webservices"
DESCRIPTION = "liblastfm is a collection of libraries to help you integrate Last.fm services \
into your rich desktop software. It is officially supported software developed \
by Last.fm staff. \
 \
This package contains development files for liblastfm."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "liblastfm-qt5-devel-1.1.0-1.10.aarch64.rpm"
RPM_HASH = "bd8c3c60c79910068735f08137e7dae31e677d7698e47f282f6a9513afdd81c73efbb538b4c5cfa7a1dda7b632c1ef470f04b238788b1286a23c26880be87a5c"

RPROVIDES:${PN} += "liblastfm-qt5-devel \
liblastfm-qt5-devel(aarch-64)"

RDEPENDS:${PN} += "liblastfm5-1 \
liblastfm_fingerprint5-1 \
pkgconfig \
pkgconfig(Qt5Core) \
pkgconfig(Qt5DBus) \
pkgconfig(Qt5Network) \
pkgconfig(Qt5Xml)"

inherit rpm
