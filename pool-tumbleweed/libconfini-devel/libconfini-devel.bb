SUMMARY = "INI file parser library - development files"
DESCRIPTION = "libconfini is a INI file parser library written in C. \
This package contains files required for development."
LICENSE = "GPL-3.0-or-later"

PV = "1.16.4"

RPM_NAME = "libconfini-devel-1.16.4-1.5.aarch64.rpm"
RPM_HASH = "1527e87607b84b64374b76195224dae270e012986f9c4cdd9796e953b8a1bff3b78ce53e48dd1bee7a0303cf9a6b476ca7dde0bf6c8c4ba7ac79f4b331efef0a"

RPROVIDES:${PN} += "libconfini-devel \
pkgconfig-libconfini"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libconfini0"

inherit rpm
