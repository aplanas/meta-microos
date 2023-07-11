SUMMARY = "Minimalistic Variant of Class::Accessor"
DESCRIPTION = "The module is a variant of 'Class::Accessor'. It is fast and requires less \
typing, has no dependencies to other modules, and does not mess up the \
@ISA."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Class-Accessor-Lite-0.08-2.21.noarch.rpm"
RPM_HASH = "0c8f3bf0d089276c5e632a1c66c22d42e76f3cb5b73304a19c20cacc316d08450c09b96b90cb98b82f6cb35cced69d54378e9e5045b899337ebb6e4a94290536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Accessor--Lite \
perl-Class-Accessor-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
