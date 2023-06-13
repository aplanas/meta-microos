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

RPM_NAME = "perl-Package-Variant-1.003002-1.25.noarch.rpm"
RPM_HASH = "1861cf250f39d75fe8671ab3160028a2998d38da2eda615d0e69cb5ec971f0b80e366cd3b544159d6a4e40213a6e2ffeac437efb1be2ae539484616e00fbd3a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Package::Variant) \
perl-Package-Variant"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Import::Into) \
perl(Module::Runtime) \
perl(strictures)"

inherit rpm
