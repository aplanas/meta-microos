SUMMARY = "Details of the Floating Point Data Type"
DESCRIPTION = "This module is about the native floating point numerical data type. A \
floating point number is one of the types of datum that can appear in the \
numeric part of a Perl scalar. This module supplies constants describing \
the native floating point type, classification functions, and functions to \
manipulate floating point values at a low level."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.013"

RPM_NAME = "perl-Data-Float-0.013-1.22.noarch.rpm"
RPM_HASH = "d5f4ab2979c5e70533ee7ce36eddf49ac14f8707a13b1fef1885da598294268cd89a47556b768b60c858521c31fb963c81ff409f519ae1666a7dc2ae6d533586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Float \
perl-Data-Float"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
