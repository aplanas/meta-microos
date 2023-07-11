SUMMARY = "The Illicit Love Child of Moose and POE"
DESCRIPTION = "MooseX::POE is a the Moose manpage wrapper around a the POE::Session \
manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.215"

RPM_NAME = "perl-MooseX-POE-0.215-9.26.noarch.rpm"
RPM_HASH = "4ca3a578ce3b9ba90347497476fdf1d276bf2e4d6d48770b844962c3beb98c02d843b4432c84e02ae68502d1d9d809781c7f0c688b50e82bbc334550076d8e81"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-POE"

inherit rpm
