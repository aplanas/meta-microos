SUMMARY = "Pod::Coverage extension for Moose"
DESCRIPTION = "When using the Pod::Coverage manpage in combination with the Moose manpage, \
it will report any method imported from a Role. This is especially bad when \
used in combination with the Test::Pod::Coverage manpage, since it takes \
away its ease of use. \
 \
To use this module in combination with the Test::Pod::Coverage manpage, use \
something like this: \
 \
  use Test::Pod::Coverage; \
  all_pod_coverage_ok({ coverage_class => 'Pod::Coverage::Moose'});"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.07"

RPM_NAME = "perl-Pod-Coverage-Moose-0.07-1.25.noarch.rpm"
RPM_HASH = "82c824e6eb7b63edb04f3078ff19fa17cb73831151e072b5633108f8411e9cf424d2722ff5ea8c194b59c74d8fa7bd266d647ab103d47f28c744304957611928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Coverage--Moose \
perl-Pod-Coverage-Moose"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Load \
perl-Moose \
perl-Pod--Coverage \
perl-namespace--autoclean"

inherit rpm
