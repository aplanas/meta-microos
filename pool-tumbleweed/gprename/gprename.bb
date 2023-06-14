SUMMARY = "A GTK3 batch renamer for files and directories"
DESCRIPTION = "GPRename is a complete GTK3/perl batch renamer for files and directories."
LICENSE = "GPL-3.0+"

PV = "5.0.20220807"

RPM_NAME = "gprename-5.0.20220807-1.2.noarch.rpm"
RPM_HASH = "640e4085dc3fdce4556d16530ce70721de060e3e6fa6e296373e1f29fbafe426035081de17b1b4945ea6215d6ab92e6453fb1eaa7277ebd8440cd74f731d0800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gprename"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Gtk3 \
perl-Pango \
perl-gettext \
perl-libintl-perl"

inherit rpm
