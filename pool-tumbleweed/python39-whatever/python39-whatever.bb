SUMMARY = "Module to make anonymous functions by partial application of operators"
DESCRIPTION = "A Python module to make lambdas by partial application of python operators. \
It is inspired by the Perl 6 one, see http://perlcabal.org/syn/S02.html#The_Whatever_Object"
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python39-whatever-0.7-1.2.noarch.rpm"
RPM_HASH = "470e2eb2df19b707c94a28409b44c24b99b7b9673df78355fb3f3da9dcbfc32fc01889e890ba1f810b65623d7609d0ebd5dad52098c63d87f4c9091f5cb95b35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-whatever \
python39-whatever \
python3dist-whatever"

RDEPENDS:${PN} += "python-abi"

inherit rpm
