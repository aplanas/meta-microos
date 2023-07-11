SUMMARY = "A wrapper for perl's configuration"
DESCRIPTION = "ExtUtils::Config is an abstraction around the %Config hash. By itself it is \
not a particularly interesting module by any measure, however it ties \
together a family of modern toolchain modules."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.008"

RPM_NAME = "perl-ExtUtils-Config-0.008-1.27.noarch.rpm"
RPM_HASH = "1090ff690ddb880e76dc0b1d1419aaf68f9154408805b313a0610fa18ce91ae75e4bf066764939a1f28de4e2c682e29b77e70b5dc275656aa15eee41a176bf9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--Config \
perl-ExtUtils-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
