SUMMARY = "A wrapper for perl's configuration"
DESCRIPTION = "ExtUtils::Config is an abstraction around the %Config hash. By itself it is \
not a particularly interesting module by any measure, however it ties \
together a family of modern toolchain modules."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.008"

RPM_NAME = "perl-ExtUtils-Config-0.008-1.28.noarch.rpm"
RPM_HASH = "2eb8bd26597d54c1f2a4e71d62b27ba862c31a6b85590b561a50fd529688cf5125e5dbac78c52ef0c9f6359facc8a29565e18066ddb364a26ec297b956d9bc84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--Config \
perl-ExtUtils-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
