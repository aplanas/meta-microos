SUMMARY = "LeechCraft Azoth MrIM Module"
DESCRIPTION = "This package provides a MRIM protocol plugin for LeechCraft Azoth. \
 \
The MRIM protocol is used in the Mail.Ru Agent IM service. \
 \
Vader is based on an own implementation of the MRIM protocol, partially based \
on available (and outdated) official specs, and is partly reverse-engineered. \
 \
The following protocol features are supported: \
 * Extended statuses. \
 * Attention requests (alarms). \
 * Publishing current tune and fetching others' tune. \
 * Message delivery receipts. \
 * Mailbox notifications. \
 * Opening mailbox without login. \
 * Authorization management. \
 * Grouping contacts."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-vader-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "900834c8bd65c9049215d18b657ea85c36aca8e0694422af0f09a7793dd48190e2f0ace5374c45825ac56001bef6ebdddf3505c4782d1e6821569e5b33f0bc81"

RPROVIDES:${PN} += "leechcraft-azoth-protocolplugin \
leechcraft-azoth-vader \
libleechcraft-azoth-vader.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
