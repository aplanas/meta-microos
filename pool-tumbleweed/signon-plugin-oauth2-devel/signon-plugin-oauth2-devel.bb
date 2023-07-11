SUMMARY = "Development files for signon-plugin-oauth2"
DESCRIPTION = "This package contains the development files for the Oauth2 plugin for the Single \
Sign On Framework."
LICENSE = "LGPL-2.0-only"

PV = "0.25"

RPM_NAME = "signon-plugin-oauth2-devel-0.25-1.12.aarch64.rpm"
RPM_HASH = "1a838b4ff08eb31bbcd3973831f906efe230e1251cbc9ed57b1252d6190a8bc61f4e537a263df6c324408eb4fe85400df3ab28142eb458b1831aa3b174452574"

RPROVIDES:${PN} += "pkgconfig-signon-oauth2plugin \
signon-plugin-oauth2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-signon-plugins \
signon-plugin-oauth2"

inherit rpm
