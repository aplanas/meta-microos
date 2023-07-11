SUMMARY = "Test-time utilities for checking C headers, libraries, or OS features (D[cut]"
DESCRIPTION = "*DEPRECATED*: The intention of this module was always to test Alien modules \
(both Alien::Base based and non-Alien::Base based modules). It has a number \
of shortcomings that I believe to be better addressed by Test::Alien, so \
please consider using that for new projects, or even migrating existing \
code. \
 \
This module is a very thin convenience wrapper around ExtUtils::CChecker to \
make it useful for use in a test context. It is intended for use with Alien \
modules which need to verify that libraries work as intended with the \
Compiler and flags used by Perl to build XS modules. \
 \
By default this module is very quiet, hiding all output using Capture::Tiny \
unless there is a failure, in which case you will see the commands, flags \
and output used."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10"

RPM_NAME = "perl-Test-CChecker-0.10-1.18.aarch64.rpm"
RPM_HASH = "fd2f9a00cf8be514b629bf95c10d044687c7925d80c7d93032659345d118bf626ee1f3a87f38cc7f1ecb0b167f3951809609dcfb881e675a8cdb3e88822b7aad"

RPROVIDES:${PN} += "perl-Test--CChecker \
perl-Test-CChecker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Capture--Tiny \
perl-ExtUtils--CChecker"

inherit rpm
