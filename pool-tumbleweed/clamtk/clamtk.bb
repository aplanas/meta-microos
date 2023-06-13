SUMMARY = "GUI for the ClamAV Antivirus"
DESCRIPTION = "ClamTk is a GUI front-end for ClamAV using Gtk3-perl. \
It is designed to be an easy-to-use, point and click virus scanner."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.14"

RPM_NAME = "clamtk-6.14-1.8.noarch.rpm"
RPM_HASH = "aa3e51aa80f52420d381febf6a215f69118a236f10728610148d678a403a622bd71faea0bbef9fb2954ccbba218f5a598c25c44525afee1524d3bc3f47bc70b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(clamtk.desktop) \
clamtk \
perl(ClamTk::Analysis) \
perl(ClamTk::App) \
perl(ClamTk::Assistant) \
perl(ClamTk::GUI) \
perl(ClamTk::History) \
perl(ClamTk::Icons) \
perl(ClamTk::Network) \
perl(ClamTk::Prefs) \
perl(ClamTk::Quarantine) \
perl(ClamTk::Results) \
perl(ClamTk::Scan) \
perl(ClamTk::Schedule) \
perl(ClamTk::Settings) \
perl(ClamTk::Shortcuts) \
perl(ClamTk::Startup) \
perl(ClamTk::Update) \
perl(ClamTk::Whitelist)"

RDEPENDS:${PN} += "/usr/bin/perl \
clamav \
gnome-icon-theme \
perl(:MODULE_COMPAT_5.36.0) \
perl(Cwd) \
perl(Digest::SHA) \
perl(Encode) \
perl(File::Basename) \
perl(File::Copy) \
perl(File::Path) \
perl(Glib) \
perl(Gtk3) \
perl(JSON) \
perl(LWP::Protocol::https) \
perl(LWP::UserAgent) \
perl(Locale::gettext) \
perl(Net::DNS) \
perl(Text::CSV) \
perl(Time::Piece) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(GdkPixdata) \
typelib(Gtk) \
typelib(Pango) \
zenity"

inherit rpm
