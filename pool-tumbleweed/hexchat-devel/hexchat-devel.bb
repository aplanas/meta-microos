SUMMARY = "Development Files for HexChat"
DESCRIPTION = "This package includes files needed to develop HexChat modules."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-devel-2.16.1-2.4.aarch64.rpm"
RPM_HASH = "518500e51ff4fe738ab211e988383928b415609890947448b539ab121e679278eee899c25f614d14e28c28e2cda02ce858900061dca330ac9f611834a40cf980"

RPROVIDES:${PN} += "hexchat-devel \
pkgconfig-hexchat-plugin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hexchat"

inherit rpm
