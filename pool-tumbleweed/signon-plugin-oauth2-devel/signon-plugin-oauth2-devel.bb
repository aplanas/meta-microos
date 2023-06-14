SUMMARY = "Development files for signon-plugin-oauth2"
DESCRIPTION = "This package contains the development files for the Oauth2 plugin for the Single \
Sign On Framework."
LICENSE = "LGPL-2.0-only"

PV = "0.25"

RPM_NAME = "signon-plugin-oauth2-devel-0.25-1.11.aarch64.rpm"
RPM_HASH = "b10fe35f73e6d57aecc58cb3ae0529fc4baf28715adbe36242f1c3dfa41eb5b736d78eaf831b8d7836d4f3b55ba4870be6c6c84b9b4119db7c329714a505359a"

RPROVIDES:${PN} += "pkgconfig-signon-oauth2plugin \
signon-plugin-oauth2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-signon-plugins \
signon-plugin-oauth2"

inherit rpm
