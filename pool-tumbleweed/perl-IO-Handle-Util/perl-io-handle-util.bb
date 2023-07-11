SUMMARY = "Functions for working with L<IO::Handle> like objects"
DESCRIPTION = "This module provides a number of helpful routines to manipulate or create \
IO::Handle like objects."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-IO-Handle-Util-0.02-1.18.noarch.rpm"
RPM_HASH = "d0ad16a411094dc43644d0fe471baed9ee65d081051d3a873539fa69cbde47fba1a214dd15332d1e5af9e887452620439fe2fda2100a9ba0a2bcff4d1820daff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Handle--Iterator \
perl-IO--Handle--Iterator--Buffered \
perl-IO--Handle--Prototype \
perl-IO--Handle--Prototype--Fallback \
perl-IO--Handle--Util \
perl-IO--Handle--Util--Overloading \
perl-IO--Handle--Util--Tie \
perl-IO-Handle-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO--String \
perl-Sub--Exporter \
perl-asa \
perl-autodie \
perl-parent"

inherit rpm
