SUMMARY = "Very Fast Base to Base Conversion"
DESCRIPTION = "This module provides fast functions and methods to convert between \
arbitrary number bases from 2 (binary) thru 65535. \
 \
This module is pure Perl, has no external dependencies, and is backward \
compatible with old versions of Perl 5."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Math-Base-Convert-0.11-2.24.noarch.rpm"
RPM_HASH = "26180110c067a62dc9b19e1cf1ed00847829d8a524754493d96d574eeb212fe695d94fc6444a35602efa3f05b7679f359f6197edaf389db00a035d0eb787107d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--Base--Convert \
perl-Math--Base--Convert--Bases \
perl-Math--Base--Convert--Bitmaps \
perl-Math--Base--Convert--CalcPP \
perl-Math--Base--Convert--Shortcuts \
perl-Math-Base-Convert"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
