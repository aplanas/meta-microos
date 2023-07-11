SUMMARY = "Development files for ProFTPD"
DESCRIPTION = "This package contains Development files for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-devel-1.3.7f-1.4.aarch64.rpm"
RPM_HASH = "64addf0871af84b38a9038d5917fe480e5c366b42f8782b476c76c0584cc144334a433900dea3ececf1b000ccd616d47e804fc08c464552e7e3bf75a0e85d479"

RPROVIDES:${PN} += "pkgconfig-proftpd \
proftpd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
proftpd"

inherit rpm
