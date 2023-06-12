SUMMARY = "A simple utility to collect system information"
DESCRIPTION = "A GNOME system and user data collection tool. \
 \
The collected data is anonymous and is sent to a secure server. \
The data will be used only for the purpose of enhancing usability and user experience of GNOME."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.5"

RPM_NAME = "gnome-info-collect-1.0.5-1.3.noarch.rpm"
RPM_HASH = "c2ef8c92f53b51c6490f0f3ff8625e5708d87efc250fd240e021ab3a39d66c6da07463c13343b7d8438d2fbd502e056b7eeaa4740f6fb4f497414f7ebc294c9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-info-collect"
RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gobject \
python3-requests \
typelib(AccountsService) \
typelib(GLib) \
typelib(Gio) \
typelib(Goa) \
typelib(Malcontent)"

inherit rpm
