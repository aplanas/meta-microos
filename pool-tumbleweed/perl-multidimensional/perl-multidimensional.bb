SUMMARY = "Disables Multidimensional Array Emulation"
DESCRIPTION = "Perl's multidimensional array emulation stems from the days before the \
language had references, but these days it mostly serves to bite you when \
you typo a hash slice by using the '$' sigil instead of '@'. \
 \
This module lexically makes using multidimensional array emulation a fatal \
error at compile time."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.014"

RPM_NAME = "perl-multidimensional-0.014-1.28.aarch64.rpm"
RPM_HASH = "24c29fefd1983694daa9948d7d4b54be494e84598ce5594a8b3779ae111e53cb1c2158f1583fe800909af23e25fad0255034d67d900c0398ae890817043124c9"

RPROVIDES:${PN} += "perl-multidimensional"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-B--Hooks--OP--Check"

inherit rpm
