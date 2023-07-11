SUMMARY = "Password storage implementation based on GNOME Keyring"
DESCRIPTION = "Password storage implementation based on GNOME Keyring."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0000"

RPM_NAME = "perl-Passwd-Keyring-Gnome-1.0000-1.14.aarch64.rpm"
RPM_HASH = "6406b579218a23ba3f3523cf91cf3b6abf77ee65cc02d7848189073527030908afeb2d49cc6af417c0b2eebb4c4b2868ae5e5e52c8ccdf2610d6fe08fb2f3807"

RPROVIDES:${PN} += "perl-Passwd--Keyring--Gnome \
perl-Passwd-Keyring-Gnome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnome-keyring.so.0 \
perl--MODULE-COMPAT-5.36.1 \
perl-File--ShareDir"

inherit rpm
