SUMMARY = "Building, finding and using tidyp library - L<http://www.tidyp.com>"
DESCRIPTION = "Building, finding and using tidyp library - L<http://www.tidyp.com>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.4.7"

RPM_NAME = "perl-Alien-Tidyp-1.4.7-8.28.noarch.rpm"
RPM_HASH = "17646be4b05b1fa42bb382db0ed2eb7dcac0748e32e0d5926f0d0b2e16120dc749add162c11f7137126d468e8f27f3af8f547b342c059723646e60bc15cd6dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Alien::Tidyp) \
perl(Alien::Tidyp::ConfigData) \
perl-Alien-Tidyp"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(File::ShareDir)"

inherit rpm
