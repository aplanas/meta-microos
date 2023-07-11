SUMMARY = "Database report plugin for Prelude Manager"
DESCRIPTION = "This plugin allows prelude-manager to write to database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-manager-db-plugin-5.2.0-2.11.aarch64.rpm"
RPM_HASH = "64551958dbce21829b33f58f5f72d3b59c62f7b3d73fddb8196e513cb74de68d762e88ebe586d19a703f7e34eb22a7a9a054ed7ca6e63ae57733acb5a8f35aee"

RPROVIDES:${PN} += "prelude-manager-db-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprelude.so.28 \
libpreludedb.so.7 \
prelude-manager"

inherit rpm
