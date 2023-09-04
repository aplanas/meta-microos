SUMMARY = "Persistent Storage for Arbitrary Data (for Embperl)"
DESCRIPTION = "Apache::SessionX extends Apache::Session. It was initially written to \
use Apache::Session from inside of HTML::Embperl, but is seems to be \
useful outside of Embperl as well, so here is it as standalone module."
LICENSE = "GPL-2.0+"

PV = "2.01"

RPM_NAME = "perl-Apache-SessionX-2.01-244.29.aarch64.rpm"
RPM_HASH = "5915e54169c4da7e7c1dc4990b39963fde802305efd23927953df2c7e89ca972291d9ad059b547cd249d0c19884aadbf9f7fef94b9cac64fee4530655e0607b6"

RPROVIDES:${PN} += "Apache-SessionX \
perl-Apache--SessionX \
perl-Apache--SessionX--Config \
perl-Apache--SessionX--Generate--MD5 \
perl-Apache--SessionX--Manager \
perl-Apache--SessionX--Store--File \
perl-Apache-SessionX"

RDEPENDS:${PN} += "apache2-mod-perl \
perl--MODULE-COMPAT-5.38.0 \
perl-DBI \
perl-URI"

inherit rpm
