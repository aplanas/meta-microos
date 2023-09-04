SUMMARY = "Minimalistic Variant of Class::Accessor"
DESCRIPTION = "The module is a variant of 'Class::Accessor'. It is fast and requires less \
typing, has no dependencies to other modules, and does not mess up the \
@ISA."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Class-Accessor-Lite-0.08-2.22.noarch.rpm"
RPM_HASH = "8d0058bf89c30826bc022268e564d3e059dd1bdeeddf23965f9395c30ac647259e1cdfafc1ed9f0422890a898df7fce0eeaf586592089882b237792c15cfb21f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Accessor--Lite \
perl-Class-Accessor-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
