SUMMARY = "Persistent Storage for Arbitrary Data (for Embperl)"
DESCRIPTION = "Apache::SessionX extends Apache::Session. It was initially written to \
use Apache::Session from inside of HTML::Embperl, but is seems to be \
useful outside of Embperl as well, so here is it as standalone module."
LICENSE = "GPL-2.0+"

PV = "2.01"

RPM_NAME = "perl-Apache-SessionX-2.01-244.28.aarch64.rpm"
RPM_HASH = "6c0492794451fc7f1d28390216779ea3adca6079d2d0f838b62ffce2bf8a5547940c2f05323bf8ac4245202099208af0a9ec2504144be078b36b19c35b4312ff"

RPROVIDES:${PN} += "Apache-SessionX \
perl-Apache--SessionX \
perl-Apache--SessionX--Config \
perl-Apache--SessionX--Generate--MD5 \
perl-Apache--SessionX--Manager \
perl-Apache--SessionX--Store--File \
perl-Apache-SessionX"

RDEPENDS:${PN} += "apache2-mod-perl \
perl--MODULE-COMPAT-5.36.1 \
perl-DBI \
perl-URI"

inherit rpm
