SUMMARY = "Perl implementation of the 'Adapter' Design Pattern"
DESCRIPTION = "The 'Class::Adapter' class is intended as an abstract base class for \
creating any sort of class or object that follows the _Adapter_ pattern."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.09"

RPM_NAME = "perl-Class-Adapter-1.09-1.17.noarch.rpm"
RPM_HASH = "31e5d995030dbb9b144d37e4bae9fdeb78fd50eab4456be2513fab61906b6063a965ca0e9bdd8a8e887b3cf64257f53f51491458224413d977b1d956b0cb3584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Adapter) \
perl(Class::Adapter::Builder) \
perl(Class::Adapter::Clear) \
perl-Class-Adapter"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
