SUMMARY = "Perl implementation of GNTP Protocol (Client Part)"
DESCRIPTION = "Growl::GNTP is Perl implementation of GNTP Protocol (Client Part)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.21"

RPM_NAME = "perl-Growl-GNTP-0.21-1.24.noarch.rpm"
RPM_HASH = "21d6d99bdd179f37a96e3599d6bf8baa4878505e7fcad3150bfb9fc961ec76ff7fc19281f49f2b2fb50b6990f77fd38f32d67c77b31f8705ee5e6f734b9be0e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Growl--GNTP \
perl-Growl-GNTP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Crypt--CBC \
perl-Data--UUID \
perl-Digest--SHA"

inherit rpm
