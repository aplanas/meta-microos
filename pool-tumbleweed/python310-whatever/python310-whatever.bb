SUMMARY = "Module to make anonymous functions by partial application of operators"
DESCRIPTION = "A Python module to make lambdas by partial application of python operators. \
It is inspired by the Perl 6 one, see http://perlcabal.org/syn/S02.html#The_Whatever_Object"
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python310-whatever-0.7-1.2.noarch.rpm"
RPM_HASH = "ac89a0fcfc9ff87f229c3b93e22927642e2b9dd86f5a1b658aafc3d518b26b5144a3be38dc8cc966b27cc2763da5b51e671a1b5854b7f153941ebd651b58d081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whatever \
python3.10dist-whatever \
python310-whatever \
python3dist-whatever"

RDEPENDS:${PN} += "python-abi"

inherit rpm
