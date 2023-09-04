SUMMARY = "Cut-and-Paste-Detector for Perl code"
DESCRIPTION = "The module's main purpose is to report repeated text fragments (typically \
Perl code) that could be considered for isolation and/or abstraction in \
order to reduce multiple copies of the same code (aka cut and paste code)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10"

RPM_NAME = "perl-Code-DRY-0.10-1.24.aarch64.rpm"
RPM_HASH = "e20de57656ff7988338d99ebe4b9c6b026b5740d250d7a8ae343a175a132b031bcab42fdd4ed3d08e0b66e0233a558b5c5ab16f27733bfae96ab2c6199ecd932"

RPROVIDES:${PN} += "perl-Code--DRY \
perl-Code-DRY"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-ExtUtils--CBuilder \
perl-Module--Build \
perl-TAP--Harness"

inherit rpm
