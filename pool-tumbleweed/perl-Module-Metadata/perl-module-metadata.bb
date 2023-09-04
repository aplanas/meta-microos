SUMMARY = "Gather package and POD information from perl module files"
DESCRIPTION = "This module provides a standard way to gather metadata about a .pm file \
through (mostly) static analysis and (some) code execution. When \
determining the version of a module, the '$VERSION' assignment is 'eval'ed, \
as is traditional in the CPAN toolchain."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.000038"

RPM_NAME = "perl-Module-Metadata-1.000038-1.3.noarch.rpm"
RPM_HASH = "cdc9e12745a1646ed1081944f630515cea50c2c72e12200b48ab1e2b703acf161c5415975e66cf4075a1e54448af22880347db57d67c5abc3dfc8d9c51033d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Metadata \
perl-Module-Metadata"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-version"

inherit rpm
