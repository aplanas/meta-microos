SUMMARY = "Helps troubleshoot SELinux problems"
DESCRIPTION = "setroubleshoot GUI. Application that allows you to view setroubleshoot-server \
messages. \
Provides tools to help diagnose SELinux problems. When AVC messages \
are generated an alert can be generated that will give information \
about the problem and help track its resolution. Alerts can be configured \
to user preference. The same tools can be run on existing log files."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.31"

RPM_NAME = "setroubleshoot-3.3.31-1.1.aarch64.rpm"
RPM_HASH = "189930748c706fb59524101289f290923721606df37963108e2f3ed60e1fa4b8d2a99621edef7ba6bb59515ebaf05a00f7e6e12d84b4cf904372363c11122faa"

RPROVIDES:${PN} += "config-setroubleshoot \
setroubleshoot"

RDEPENDS:${PN} += "/usr/bin/python3 \
dbus-1 \
desktop-file-utils \
gtk3 \
libnotify \
python-abi \
python3-dasbus \
python3-gobject \
setroubleshoot-server \
xdg-utils"

inherit rpm
