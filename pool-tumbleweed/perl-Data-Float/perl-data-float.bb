SUMMARY = "Details of the Floating Point Data Type"
DESCRIPTION = "This module is about the native floating point numerical data type. A \
floating point number is one of the types of datum that can appear in the \
numeric part of a Perl scalar. This module supplies constants describing \
the native floating point type, classification functions, and functions to \
manipulate floating point values at a low level."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.013"

RPM_NAME = "perl-Data-Float-0.013-1.20.noarch.rpm"
RPM_HASH = "b27852593852cbfffbe14d413f043a3da0ecbcda9d2e8608d3f8e474e92170e5902b8166a8fdac57df814c4b3265bcc2627429ef00c4e790d1da2eeee9cee88a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Float \
perl-Data-Float"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-parent"

inherit rpm
