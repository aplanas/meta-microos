SUMMARY = "Module to make anonymous functions by partial application of operators"
DESCRIPTION = "A Python module to make lambdas by partial application of python operators. \
It is inspired by the Perl 6 one, see http://perlcabal.org/syn/S02.html#The_Whatever_Object"
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python311-whatever-0.7-1.4.noarch.rpm"
RPM_HASH = "31dd8148bfab0bb5a777c966bed555c94ed01bcbb557cda1689b755aa1218a9495b600479e59177766a9aeb3a48ff84cae40b17cc3c9fe065e02b70859d4cecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whatever \
python3.11dist-whatever \
python311-whatever \
python3dist-whatever"

RDEPENDS:${PN} += "python-abi"

inherit rpm
