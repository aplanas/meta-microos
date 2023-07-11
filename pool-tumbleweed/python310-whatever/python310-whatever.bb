SUMMARY = "Module to make anonymous functions by partial application of operators"
DESCRIPTION = "A Python module to make lambdas by partial application of python operators. \
It is inspired by the Perl 6 one, see http://perlcabal.org/syn/S02.html#The_Whatever_Object"
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python310-whatever-0.7-1.4.noarch.rpm"
RPM_HASH = "4d5d92187dbb63663de7527e8643b9217cf54a6889275eb5609e9e065bfd4d80c8c308817e01f037b62b496539bd059c585bdad898c73288efd2268af3bbb0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-whatever \
python310-whatever \
python3dist-whatever"

RDEPENDS:${PN} += "python-abi"

inherit rpm
