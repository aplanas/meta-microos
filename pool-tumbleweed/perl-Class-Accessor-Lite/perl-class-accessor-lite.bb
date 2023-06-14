SUMMARY = "Minimalistic Variant of Class::Accessor"
DESCRIPTION = "The module is a variant of 'Class::Accessor'. It is fast and requires less \
typing, has no dependencies to other modules, and does not mess up the \
@ISA."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Class-Accessor-Lite-0.08-2.20.noarch.rpm"
RPM_HASH = "e4f57583b6225b8949f711b2e072cd8edf0c41413743b3ac77bc1bd64f279f7670392207229f889f336c72519580909700ba15def59fba2812de427edf103ed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Accessor--Lite \
perl-Class-Accessor-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
