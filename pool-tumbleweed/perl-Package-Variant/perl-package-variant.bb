SUMMARY = "Parameterizable packages"
DESCRIPTION = "This module allows you to build a variable package that contains a package \
template and can use it to build variant packages at runtime. \
 \
Your variable package will export a subroutine which will build a variant \
package, combining its arguments with the template, and return the name of \
the new variant package. \
 \
The implementation does not care about what kind of packages it builds, be \
they simple function exporters, classes, singletons or something entirely \
different."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.003002"

RPM_NAME = "perl-Package-Variant-1.003002-1.26.noarch.rpm"
RPM_HASH = "c5b2a0e04cb47ea8b705109bd35a13163ecf9096e84d9e07cc2f0b31102ba09f4e1120cf578c198bdc28031628aca2a840d929dff6fe5faafaf341b9ad2918fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Package--Variant \
perl-Package-Variant"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Import--Into \
perl-Module--Runtime \
perl-strictures"

inherit rpm
