SUMMARY = "Password storage implementation based on GNOME Keyring"
DESCRIPTION = "Password storage implementation based on GNOME Keyring."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0000"

RPM_NAME = "perl-Passwd-Keyring-Gnome-1.0000-1.15.aarch64.rpm"
RPM_HASH = "2bf3b06d672f7649b5c777897cf9ed717bc656ec95a39288906ae7ffdab5df6351711cc728d006ff1953ea898cc870a6cff49453ad5b58c06f859fa2a161f26a"

RPROVIDES:${PN} += "perl-Passwd--Keyring--Gnome \
perl-Passwd-Keyring-Gnome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnome-keyring.so.0 \
perl--MODULE-COMPAT-5.38.0 \
perl-File--ShareDir"

inherit rpm
