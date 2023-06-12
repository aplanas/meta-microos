SUMMARY = "Rot13 (Caesar) encryption for perl"
DESCRIPTION = "This package provides ROT13 Algorithm (Caesar) as a Perl module."
LICENSE = "GPL-2.0+"

PV = "0.6"

RPM_NAME = "perl-Crypt-Rot13-0.6-22.24.noarch.rpm"
RPM_HASH = "072275bb0f684c540141a035b11e372ac84a4fce56b0d432a78cf920abf3221b5a94fdaf2595d63b844d3cd07e84be0e4706b62f711f72087571a0d6a5e411eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Crypt::Rot13) \
perl-Crypt-Rot13"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
