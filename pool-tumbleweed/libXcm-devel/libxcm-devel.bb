SUMMARY = "Headers, Configuration and static Libs + Documentation"
DESCRIPTION = "The libXcm library is a reference implementation of the X Color Management specification. \
It allows to attach color regions to X windows to communicate with color \
servers. A EDID parser and a color management event observer are included. \
The package contains headers and other development files."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "libXcm-devel-0.5.4-1.22.aarch64.rpm"
RPM_HASH = "0437ed22aff45dd99d3cf204962f895c35ae7258d5a58dc1b52bfba635869380f5c8b9612ffe6e92c19f820933b4bb6735142f48bf80ead2d5af028abbdbf7c6"

RPROVIDES:${PN} += "libXcm-devel \
pkgconfig-xcm \
pkgconfig-xcm-ddc \
pkgconfig-xcm-edid \
pkgconfig-xcm-x11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXcm0 \
libXcmDDC0 \
libXcmEDID0 \
libXcmX11-0 \
pkgconfig-x11 \
pkgconfig-xcm-ddc \
pkgconfig-xcm-edid \
pkgconfig-xcm-x11 \
pkgconfig-xproto"

inherit rpm
