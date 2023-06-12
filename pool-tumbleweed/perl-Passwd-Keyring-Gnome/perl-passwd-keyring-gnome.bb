SUMMARY = "Password storage implementation based on GNOME Keyring"
DESCRIPTION = "Password storage implementation based on GNOME Keyring."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0000"

RPM_NAME = "perl-Passwd-Keyring-Gnome-1.0000-1.13.aarch64.rpm"
RPM_HASH = "3f635b1ad1fbe077d4e308485f96f3b6334134fa3d32b966fc69d4e5464a539e268fd6727c955fa7a18be68e1f9e64829ed0706d53a3c4f2d5e261f579580a8f"

RPROVIDES:${PN} += "perl(Passwd::Keyring::Gnome) \
perl-Passwd-Keyring-Gnome \
perl-Passwd-Keyring-Gnome(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-keyring.so.0()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(File::ShareDir)"

inherit rpm