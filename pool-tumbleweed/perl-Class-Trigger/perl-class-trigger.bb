SUMMARY = "Mixin to add / call inheritable triggers"
DESCRIPTION = "Class::Trigger is a mixin class to add / call triggers (or hooks) that get \
called at some points you specify."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Class-Trigger-0.15-1.14.noarch.rpm"
RPM_HASH = "676c173ca3fc8d6cb23e630112ee1f86f848eb68d3abb58f90f6ea47e831bf6b4bc0e71c45e1f25700e32d476871ef2710c666910c4d33a6aa00e4b8098d8ad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Trigger \
perl-Class-Trigger"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
