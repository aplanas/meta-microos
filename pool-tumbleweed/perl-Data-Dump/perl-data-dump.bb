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

RPM_NAME = "perl-Data-Dump-1.25-1.11.noarch.rpm"
RPM_HASH = "ac85cf25c2675a135543ccfbc02b95da1dc6edf22b577c626c262427b3bae5a527c0959470d7c6f4d099f7bc07897c2928b2e1bb7c99c4efd7f7339241e3b06c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Dump \
perl-Data--Dump--FilterContext \
perl-Data--Dump--Filtered \
perl-Data--Dump--Trace \
perl-Data--Dump--Trace--Call \
perl-Data--Dump--Trace--Wrapper \
perl-Data-Dump"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
