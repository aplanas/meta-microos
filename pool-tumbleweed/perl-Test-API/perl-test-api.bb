SUMMARY = "Test a list of subroutines provided by a module"
DESCRIPTION = "This simple test module checks the subroutines provided by a module. This \
is useful for confirming a planned API in testing and ensuring that other \
functions aren't unintentionally included via import."
LICENSE = "Apache-2.0"

PV = "0.010"

RPM_NAME = "perl-Test-API-0.010-1.13.noarch.rpm"
RPM_HASH = "f8df2313e1511c22e4da7542799c3040a8a01620dcde17aa4439ed26536e4a20d468bdf389a47292a1949bd5fcf2897e969e21ed6e2231b4d832dafe8466847b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--API \
perl-Test-API"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--Builder--Module"

inherit rpm
