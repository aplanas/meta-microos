SUMMARY = "The Illicit Love Child of Moose and POE"
DESCRIPTION = "MooseX::POE is a the Moose manpage wrapper around a the POE::Session \
manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.215"

RPM_NAME = "perl-MooseX-POE-0.215-9.25.noarch.rpm"
RPM_HASH = "22686f59c27e56f6a02c2ded73a4ffe87747049775a07ed4e863d5f81c7391c6597aec14703ffda307d8ce49d98047cd0f89fac378a20b78453610383250e737"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Moose \
perl-POE"

inherit rpm
