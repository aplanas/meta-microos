SUMMARY = "Support multimethods and function overloading in Perl"
DESCRIPTION = "The Class:Multimethod module exports a subroutine (&multimethod) that can \
be used to declare other subroutines that are dispatched using a algorithm \
different from the normal Perl subroutine or method dispatch mechanism."
LICENSE = "Artistic-1.0"

PV = "1.701"

RPM_NAME = "perl-Class-Multimethods-1.701-1.22.noarch.rpm"
RPM_HASH = "d1c0d572a6234797c8d63787396bb008d2b60c3cebd09fcd847da2e1d778383154d04d9b514ffca2638cebd272e2f6593a7818eb5658a37376f272b1d6fa95bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Multimethods \
perl-Class-Multimethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
