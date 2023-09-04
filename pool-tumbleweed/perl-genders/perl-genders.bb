SUMMARY = "Perl bindings for genders"
DESCRIPTION = "Necessary files for using genders with Perl."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "perl-genders-1.28.1-2.6.aarch64.rpm"
RPM_HASH = "3ea3ffb4e56589769f6016a37945352c6aaa52d1113f2c83d298d32cd5ed7645394e3729fd45b21cc3d8bbf090175ae9679a7401bbba6531d1bc612870f0bb89"

RPROVIDES:${PN} += "perl-Genders \
perl-Libgenders \
perl-genders"

RDEPENDS:${PN} += "genders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgenders.so.0 \
perl-base"

inherit rpm
