SUMMARY = "Pretty printing of data structures"
DESCRIPTION = "This module provides a few functions that traverse their argument list and \
return a string containing Perl code that, when 'eval'ed, produces a deep \
copy of the original arguments. \
 \
The main feature of the module is that it strives to produce output that is \
easy to read. Example: \
 \
    @a = (1, [2, 3], {4 => 5}); \
    dump(@a); \
 \
Produces: \
 \
    '(1, [2, 3], { 4 => 5 })' \
 \
If you dump just a little data, it is output on a single line. If you dump \
data that is more complex or there is a lot of it, line breaks are \
automatically added to keep it easy to read."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.25"

RPM_NAME = "perl-Data-Dump-1.25-1.10.noarch.rpm"
RPM_HASH = "93ace24064a2312ca5d3f877e9ee52b348ae5b53a3c81262f967cc0b1c902feac1f03cba7bc8187dd87f9a8e81b3316a74892e64e08521738f6b06bc24f18a34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Dump \
perl-Data--Dump--FilterContext \
perl-Data--Dump--Filtered \
perl-Data--Dump--Trace \
perl-Data--Dump--Trace--Call \
perl-Data--Dump--Trace--Wrapper \
perl-Data-Dump"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
