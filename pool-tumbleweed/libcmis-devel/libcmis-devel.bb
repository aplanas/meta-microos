SUMMARY = "Development files for libcmis"
DESCRIPTION = "Development files for libcmis. libcmis is a C++ client library for \
the CMIS interface."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libcmis-devel-0.5.2-1.24.aarch64.rpm"
RPM_HASH = "e378ef984ba702061589050240bad1b66aac1e1b3190f863511aee6420bf9b5e0f83401945b4cd9798d145379c11f534fc46ba89a996b69045c04a56f459fbd2"

RPROVIDES:${PN} += "libcmis-devel \
libcmis-devel(aarch-64) \
pkgconfig(libcmis-0.5)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcmis-0_5-5 \
pkgconfig(libcurl) \
pkgconfig(libxml-2.0)"

inherit rpm
