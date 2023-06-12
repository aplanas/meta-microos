SUMMARY = "Helps troubleshoot SELinux problems"
DESCRIPTION = "setroubleshoot GUI. Application that allows you to view setroubleshoot-server \
messages. \
Provides tools to help diagnose SELinux problems. When AVC messages \
are generated an alert can be generated that will give information \
about the problem and help track its resolution. Alerts can be configured \
to user preference. The same tools can be run on existing log files."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.30"

RPM_NAME = "setroubleshoot-3.3.30-2.2.aarch64.rpm"
RPM_HASH = "730844273e3345c128a12824018c0b29bd05dd61817af26721410337bb48e2930efa29be83a2463a5180b84164c9d96b69d2f1e595fa19289aeb77f03a486614"

RPROVIDES:${PN} += "application() \
application(setroubleshoot.desktop) \
config(setroubleshoot) \
metainfo() \
metainfo(setroubleshoot.appdata.xml) \
setroubleshoot \
setroubleshoot(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
dbus-1 \
desktop-file-utils \
gtk3 \
libnotify \
python(abi) \
python3-dasbus \
python3-gobject \
setroubleshoot-server \
xdg-utils"

inherit rpm
