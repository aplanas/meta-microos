SUMMARY = "Test a list of subroutines provided by a module"
DESCRIPTION = "This simple test module checks the subroutines provided by a module. This \
is useful for confirming a planned API in testing and ensuring that other \
functions aren't unintentionally included via import."
LICENSE = "Apache-2.0"

PV = "0.010"

RPM_NAME = "perl-Test-API-0.010-1.12.noarch.rpm"
RPM_HASH = "e112858f26200fda94de4ca14c32f849a576957228481c224321a6556726110771c881f453a8a93c9924efb0c3217f7d013f3a5f180f91c8e7baf2f8043e2426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--API \
perl-Test-API"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--Builder--Module"

inherit rpm
