SUMMARY = "Library to download and display gravatars"
DESCRIPTION = "This package contains the debug categories for the libgravatar library."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libgravatar-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "70ef3328996b2af6fcb599f52c3d586ca38fc14de921c6264d477659b668ca66a3fe5bbddd3ae00afe1d4de625a2380d495d970cc388193b5fd0d0fa36af62be"

RPROVIDES:${PN} += "libgravatar"

RDEPENDS:${PN} += ""

inherit rpm
