SUMMARY = "The Illicit Love Child of Moose and POE"
DESCRIPTION = "MooseX::POE is a the Moose manpage wrapper around a the POE::Session \
manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.215"

RPM_NAME = "perl-MooseX-POE-0.215-9.27.noarch.rpm"
RPM_HASH = "381905628d962468d039f49d6e97bcd0ea8fbc59a9680390f9ddbbaea1f0491638bfee3d8180f18da47155a06cb60d8e299b8dac94f1a9a92998b68fad69f4a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--POE \
perl-MooseX--POE--Aliased \
perl-MooseX--POE--Meta--Method--State \
perl-MooseX--POE--Meta--Role \
perl-MooseX--POE--Meta--Trait \
perl-MooseX--POE--Meta--Trait--Class \
perl-MooseX--POE--Meta--Trait--Instance \
perl-MooseX--POE--Meta--Trait--Object \
perl-MooseX--POE--Meta--Trait--SweetArgs \
perl-MooseX--POE--Role \
perl-MooseX--POE--SweetArgs \
perl-MooseX-POE"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-POE"

inherit rpm
