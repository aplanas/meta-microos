SUMMARY = "Development files for the Atheme IRC Services core"
DESCRIPTION = "Atheme is a set of modular IRC services (NickServ, ChanServ, etc.) \
designed to link with many kinds of IRCds. \
 \
This package contains the development headers for the library found \
in libathemecore1."
LICENSE = "MIT"

PV = "7.2.12"

RPM_NAME = "atheme-devel-7.2.12-2.10.aarch64.rpm"
RPM_HASH = "fc51a8d1c6f8aad23125fe10cc9d5a5af607d13e4b7513db509fc9b019a5c56fc0416cb30d183b5ed2f8cf4545159b832868e4507e7915b7cdfb59a20f8c6238"

RPROVIDES:${PN} += "atheme-devel \
pkgconfig-atheme-services"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libathemecore1"

inherit rpm
