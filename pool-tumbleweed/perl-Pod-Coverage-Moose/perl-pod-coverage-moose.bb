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

RPM_NAME = "perl-Pod-Coverage-Moose-0.07-1.24.noarch.rpm"
RPM_HASH = "3421abcaa9809ac5f3b38dc5a883a871c79f1a03b530f8b9adfeac52af73040be54cd8db0a1abb67b510500c04303a43d660fdd9db4c80789c20c57ee179d2a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Coverage--Moose \
perl-Pod-Coverage-Moose"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Load \
perl-Moose \
perl-Pod--Coverage \
perl-namespace--autoclean"

inherit rpm
