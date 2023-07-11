SUMMARY = "Helps troubleshoot SELinux problems"
DESCRIPTION = "setroubleshoot GUI. Application that allows you to view setroubleshoot-server \
messages. \
Provides tools to help diagnose SELinux problems. When AVC messages \
are generated an alert can be generated that will give information \
about the problem and help track its resolution. Alerts can be configured \
to user preference. The same tools can be run on existing log files."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.30"

RPM_NAME = "setroubleshoot-3.3.30-2.3.aarch64.rpm"
RPM_HASH = "8f2f1bfa778d0a794d4695b3843d3d9f0e8648449541fb839749eada62512037990da24b539c4f19d97dc67fc754c431c6a7db50758af84c461d6a7040067b1f"

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
