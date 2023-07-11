SUMMARY = "Disables Multidimensional Array Emulation"
DESCRIPTION = "Perl's multidimensional array emulation stems from the days before the \
language had references, but these days it mostly serves to bite you when \
you typo a hash slice by using the '$' sigil instead of '@'. \
 \
This module lexically makes using multidimensional array emulation a fatal \
error at compile time."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.014"

RPM_NAME = "perl-multidimensional-0.014-1.27.aarch64.rpm"
RPM_HASH = "a84561490e01dc7f160106d2720c81439b6a15726b36f3ceafe4781659cab98139f105910dc39a30c9f03a0ecf3f4dd59b36243616645b3eed6c05e6ac9a70f0"

RPROVIDES:${PN} += "perl-multidimensional"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-B--Hooks--OP--Check"

inherit rpm
