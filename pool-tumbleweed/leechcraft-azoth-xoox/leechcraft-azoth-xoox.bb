SUMMARY = "LeechCraft Azoth XMPP Module"
DESCRIPTION = "This package provides an XMPP protocol plugin for LeechCraft Azoth. \
 \
Feature highlights: \
 * Media calls support (Jingle). \
 * Support for PEP and current user activity, mood, tune and location. \
 * Bookmarks with autojoin support. \
 * Full support for MUCs. \
 * Notifications about chat state participation. \
 * Service discovery support. \
 * Gateway support, with registration. \
 * Support for various file transfer methods. \
 * In-band registration of accounts (right from the client). \
 * Privacy lists. \
 * Encrypted and signed messages and presences. \
 * Full CAPTCHA support. \
 * Support for ad-hoc commands. \
 * Support for exchanging roster items. \
 * Search for contacts in Jabber."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-xoox-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "cbe18ab9fad805e06118e672990ec46291a2d8b49698416896b16ff783b08ff46b3d62b69e9bd47711c2973db36fd16a80cc5862ba8a7ab421fe4c1c8920a803"

RPROVIDES:${PN} += "leechcraft-azoth-protocolplugin \
leechcraft-azoth-xoox \
libleechcraft-azoth-xoox.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-network-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-threads-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libqca-qt5.so.2 \
libqxmpp.so.4 \
libstdc++.so.6"

inherit rpm
