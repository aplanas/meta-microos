SUMMARY = "Perl implementation of the 'Adapter' Design Pattern"
DESCRIPTION = "The 'Class::Adapter' class is intended as an abstract base class for \
creating any sort of class or object that follows the _Adapter_ pattern."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.09"

RPM_NAME = "perl-Class-Adapter-1.09-1.18.noarch.rpm"
RPM_HASH = "25353b066d1ae80a5489e68b304899a94db601c6fb0f4d8b3d9d242016f94b23022c2776ece2bf6cfffc84904578954b3492aa6693a55cf4df21e95096ee2fa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Adapter \
perl-Class--Adapter--Builder \
perl-Class--Adapter--Clear \
perl-Class-Adapter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
