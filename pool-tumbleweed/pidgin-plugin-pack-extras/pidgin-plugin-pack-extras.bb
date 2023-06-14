SUMMARY = "Compilation of plugins for Pidgin -- GPLv3+ Plugins"
DESCRIPTION = "The Purple Plugin Pack is a compilation of plugins for the \
libpurple family of IM clients. \
 \
This package provides the Pidgin plugins from the Purple Plugin Pack. \
 \
This package contains GPLv3+ plugins. Their licence might cause \
incompatibilities with other plugins."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "pidgin-plugin-pack-extras-2.8.0-1.3.aarch64.rpm"
RPM_HASH = "fd2246260bcd019e207a2172123290d71fed4061f12c4a17b0e85d169412489b18da62dc9e7e35f015c66fb48f0c8c7f65755e2893eac1178a105df5fd19cf0a"

RPROVIDES:${PN} += "pidgin-plugin-pack-extras"

RDEPENDS:${PN} += "libpurple-plugin-pack-extras \
pidgin-plugin-pack"

inherit rpm
