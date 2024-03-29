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

RPM_NAME = "perl-Test-CChecker-0.10-1.19.aarch64.rpm"
RPM_HASH = "1a3301ca14497417e5c323b7f2d66f7554435b421d9e9b0c5beff1d50530169d27669478d0fcbc3c528fdbab97d5a2b2453129732255f1f5610cb2a6e079067c"

RPROVIDES:${PN} += "perl-Test--CChecker \
perl-Test-CChecker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Capture--Tiny \
perl-ExtUtils--CChecker"

inherit rpm
