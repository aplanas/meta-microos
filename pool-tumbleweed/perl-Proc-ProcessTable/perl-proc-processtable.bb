SUMMARY = "Perl extension to access the unix process table"
DESCRIPTION = "Perl interface to the unix process table."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & GPL-2.0-only"

PV = "0.635"

RPM_NAME = "perl-Proc-ProcessTable-0.635-1.2.aarch64.rpm"
RPM_HASH = "772d2b9b2a1f0cba206a862b1b676e1881256f198c7a0881cb2e674d9f453cf3e387e33431a0ff6978bb2dd3547d95c265c24f488b58d63e9be6ba7d3eb30b63"

RPROVIDES:${PN} += "perl-Proc--Killall \
perl-Proc--Killfam \
perl-Proc--ProcessTable \
perl-Proc--ProcessTable--Process \
perl-Proc-ProcessTable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
