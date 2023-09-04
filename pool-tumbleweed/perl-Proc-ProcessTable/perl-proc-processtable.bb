SUMMARY = "Perl extension to access the unix process table"
DESCRIPTION = "Perl interface to the unix process table."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & GPL-2.0-only"

PV = "0.636"

RPM_NAME = "perl-Proc-ProcessTable-0.636-1.2.aarch64.rpm"
RPM_HASH = "49d79fc4060d2038cc11f7cab98652cfcf74b2d0724a0b5a573ede2a5a4f86748f39b2f8d1c7547d9be0f5939c00ecd6cace93834642e8b823d9bbde6cb57cf9"

RPROVIDES:${PN} += "perl-Proc--Killall \
perl-Proc--Killfam \
perl-Proc--ProcessTable \
perl-Proc--ProcessTable--Process \
perl-Proc-ProcessTable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
