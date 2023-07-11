SUMMARY = "Vacuum-IM User Tune Handler plugin"
DESCRIPTION = "This plugin provides support to XEP-0118: defines a payload format for \
communicating information about music to which a user is listening, including \
the title, track number, collection, performer, composer, length, and user \
rating. The payload format is typically transported using the personal eventing \
protocol, a profile of XMPP publish-subscribe specified in XEP-0163."
LICENSE = "GPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "vacuum-im-plugins-usertune-1.1.3-1.24.aarch64.rpm"
RPM_HASH = "8d49c11cabda08fc5b54fa0a3433f3a0aa35ae3fec664a48688cd7fee9e39a4518d42a94ba23023a8204efe6cb8d3452fa1ea45e64ec29a055581636644e4029"

RPROVIDES:${PN} += "libusertune.so \
vacuum-im-plugins-usertune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvacuumutils.so.37"

inherit rpm
