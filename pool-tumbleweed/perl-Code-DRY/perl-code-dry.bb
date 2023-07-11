SUMMARY = "Cut-and-Paste-Detector for Perl code"
DESCRIPTION = "The module's main purpose is to report repeated text fragments (typically \
Perl code) that could be considered for isolation and/or abstraction in \
order to reduce multiple copies of the same code (aka cut and paste code)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10"

RPM_NAME = "perl-Code-DRY-0.10-1.23.aarch64.rpm"
RPM_HASH = "219a381895b9b38cc920e5ee687843be7aee2c771d71e5e87f16413dcecc0e06ecdb61c5223fb259b36bec7ad767ff28bb08e0914da6e0b359725004d5c76bc4"

RPROVIDES:${PN} += "perl-Code--DRY \
perl-Code-DRY"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-ExtUtils--CBuilder \
perl-Module--Build \
perl-TAP--Harness"

inherit rpm
