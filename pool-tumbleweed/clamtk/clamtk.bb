SUMMARY = "GUI for the ClamAV Antivirus"
DESCRIPTION = "ClamTk is a GUI front-end for ClamAV using Gtk3-perl. \
It is designed to be an easy-to-use, point and click virus scanner."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.16"

RPM_NAME = "clamtk-6.16-1.2.noarch.rpm"
RPM_HASH = "fb6e3c2a0d8942a5c01074cfa8641879afc2872928f9d04316d170ee9c85c00923155f363347945b0a7e2c96513da02660cd75288b7b1a4de8305cad49981587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clamtk \
perl-ClamTk--Analysis \
perl-ClamTk--App \
perl-ClamTk--Assistant \
perl-ClamTk--GUI \
perl-ClamTk--History \
perl-ClamTk--Icons \
perl-ClamTk--Network \
perl-ClamTk--Prefs \
perl-ClamTk--Quarantine \
perl-ClamTk--Results \
perl-ClamTk--Scan \
perl-ClamTk--Schedule \
perl-ClamTk--Settings \
perl-ClamTk--Shortcuts \
perl-ClamTk--Startup \
perl-ClamTk--Update \
perl-ClamTk--Whitelist"

RDEPENDS:${PN} += "/usr/bin/perl \
clamav \
gnome-icon-theme \
perl--MODULE-COMPAT-5.38.0 \
perl-Cwd \
perl-Digest--SHA \
perl-Encode \
perl-File--Basename \
perl-File--Copy \
perl-File--Path \
perl-Glib \
perl-Gtk3 \
perl-JSON \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Locale--gettext \
perl-Net--DNS \
perl-Text--CSV \
perl-Time--Piece \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkPixdata \
typelib-Gtk \
typelib-Pango \
zenity"

inherit rpm
