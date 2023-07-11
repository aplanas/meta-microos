SUMMARY = "Development Files for the Last.fm Webservices"
DESCRIPTION = "liblastfm is a collection of libraries to help you integrate Last.fm services \
into your rich desktop software. It is officially supported software developed \
by Last.fm staff. \
 \
This package contains development files for liblastfm."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "liblastfm-qt5-devel-1.1.0-1.11.aarch64.rpm"
RPM_HASH = "a7a85390143b6919df24002ba67144dc7c25a6c813a55d537bad53c581d0b486dc278e49726594798bb2748dd04707b9915f97c7472b8fbcb8e2dc7963b0fd0c"

RPROVIDES:${PN} += "liblastfm-qt5-devel"

RDEPENDS:${PN} += "liblastfm-fingerprint5-1 \
liblastfm5-1 \
pkgconfig \
pkgconfig-Qt5Core \
pkgconfig-Qt5DBus \
pkgconfig-Qt5Network \
pkgconfig-Qt5Xml"

inherit rpm
