SUMMARY = "Perl extension to access the unix process table"
DESCRIPTION = "Perl interface to the unix process table."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & GPL-2.0-only"

PV = "0.636"

RPM_NAME = "perl-Proc-ProcessTable-0.636-1.1.aarch64.rpm"
RPM_HASH = "bce54ed23063e4b4632e69de141e1ee9188396df9250e41b32c92631f1a4c7d2166f00c3945ba9353d061e6d44b63b499f5bac0bcf8ed8abb5504fa407f68bf3"

RPROVIDES:${PN} += "perl-Proc--Killall \
perl-Proc--Killfam \
perl-Proc--ProcessTable \
perl-Proc--ProcessTable--Process \
perl-Proc-ProcessTable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
