SUMMARY = "Functions for working with L<IO::Handle> like objects"
DESCRIPTION = "This module provides a number of helpful routines to manipulate or create \
IO::Handle like objects."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-IO-Handle-Util-0.02-1.19.noarch.rpm"
RPM_HASH = "fabbe7464ab8040d90ea8f258fc7a498a3db490cfd9819d1f3ebb8b6a7a1c98b83aba096f2a3781ad40b801550db5c4e14d435e3dcf68cbb6420e4f0c18f0f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Handle--Iterator \
perl-IO--Handle--Iterator--Buffered \
perl-IO--Handle--Prototype \
perl-IO--Handle--Prototype--Fallback \
perl-IO--Handle--Util \
perl-IO--Handle--Util--Overloading \
perl-IO--Handle--Util--Tie \
perl-IO-Handle-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--String \
perl-Sub--Exporter \
perl-asa \
perl-autodie \
perl-parent"

inherit rpm
