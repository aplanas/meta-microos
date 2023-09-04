SUMMARY = "Perl implementation of the 'Adapter' Design Pattern"
DESCRIPTION = "The 'Class::Adapter' class is intended as an abstract base class for \
creating any sort of class or object that follows the _Adapter_ pattern."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.09"

RPM_NAME = "perl-Class-Adapter-1.09-1.19.noarch.rpm"
RPM_HASH = "d787e02eb85c59061f035b0d53df1e626dc243247dce26ab3ba0c6677c6c54b1b290ac0f739b0c74e97d94886c150c3c65d17234282d3dbdc372ed9d768f29a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Adapter \
perl-Class--Adapter--Builder \
perl-Class--Adapter--Clear \
perl-Class-Adapter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
