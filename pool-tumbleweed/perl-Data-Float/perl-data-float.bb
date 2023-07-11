SUMMARY = "Details of the Floating Point Data Type"
DESCRIPTION = "This module is about the native floating point numerical data type. A \
floating point number is one of the types of datum that can appear in the \
numeric part of a Perl scalar. This module supplies constants describing \
the native floating point type, classification functions, and functions to \
manipulate floating point values at a low level."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.013"

RPM_NAME = "perl-Data-Float-0.013-1.21.noarch.rpm"
RPM_HASH = "eaf4a145520b98022cd4a1bc2ffc3d9b84df74288d8f3271ac677f504fb9e190ed8ff8a40526926acd65295ec68923aa54575b96e16591c30b361070036f2404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Float \
perl-Data-Float"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-parent"

inherit rpm
