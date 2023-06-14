SUMMARY = "Libraries, include files for Prelude Manager"
DESCRIPTION = "Header files and libraries for prelude-manager development."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-manager-devel-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "ce03a4b62cbae691186aa0796208b3d37702a019c513018222891c919f69af136138c14c656654e08e7e584df510263dd9b3f4715f4731d5c0668626ef87c926"

RPROVIDES:${PN} += "prelude-manager-devel"

RDEPENDS:${PN} += "libpreludedb-devel \
prelude-manager"

inherit rpm
