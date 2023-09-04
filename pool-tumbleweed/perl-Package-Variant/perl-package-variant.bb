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

RPM_NAME = "perl-Package-Variant-1.003002-1.27.noarch.rpm"
RPM_HASH = "4461d75de98c21f7eee9fc8e7dc2afc0036b108fa3aaee777767e0807f6da46ee2889f590ecda68526e95a40fe033ee4a79805fbd44f9d0a28dea6e5e636d359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Package--Variant \
perl-Package-Variant"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Import--Into \
perl-Module--Runtime \
perl-strictures"

inherit rpm
