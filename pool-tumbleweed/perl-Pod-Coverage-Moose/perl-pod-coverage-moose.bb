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

RPM_NAME = "perl-Pod-Coverage-Moose-0.07-1.23.noarch.rpm"
RPM_HASH = "c7bb2c70f179e797aba4d06081dd1797c1e51f53bc88250d4f71615330a5bd46f3371283d11497798df4e8d4935d998877570f3358d686ee1fd6439a7e12669e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Pod::Coverage::Moose) \
perl-Pod-Coverage-Moose"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Load) \
perl(Moose) \
perl(Pod::Coverage) \
perl(namespace::autoclean)"

inherit rpm
