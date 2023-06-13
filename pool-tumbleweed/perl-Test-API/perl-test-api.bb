SUMMARY = "Test a list of subroutines provided by a module"
DESCRIPTION = "This simple test module checks the subroutines provided by a module. This \
is useful for confirming a planned API in testing and ensuring that other \
functions aren't unintentionally included via import."
LICENSE = "Apache-2.0"

PV = "0.010"

RPM_NAME = "perl-Test-API-0.010-1.11.noarch.rpm"
RPM_HASH = "f2366520d43cf472c5a15cee735f0f99ff25b461c806d918feef9d50eef8d047af5f40f91b230da93c58c30bfaa43fd395a10a7423121f68e45f95c53638940b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::API) \
perl-Test-API"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Test::Builder::Module)"

inherit rpm
