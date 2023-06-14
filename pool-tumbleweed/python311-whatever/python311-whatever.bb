SUMMARY = "Module to make anonymous functions by partial application of operators"
DESCRIPTION = "A Python module to make lambdas by partial application of python operators. \
It is inspired by the Perl 6 one, see http://perlcabal.org/syn/S02.html#The_Whatever_Object"
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python311-whatever-0.7-1.2.noarch.rpm"
RPM_HASH = "3582daa88efd4f9dd85f63432f7bef962fe0935f8e87b6df089ddb5dd1939414e66d9385fd888068520736e8341655fd58c9bf4eea14f0aa7e71b69a0aa570b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-whatever \
python311-whatever \
python3dist-whatever"

RDEPENDS:${PN} += "python-abi"

inherit rpm
