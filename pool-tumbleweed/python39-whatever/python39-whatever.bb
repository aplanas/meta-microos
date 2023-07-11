SUMMARY = "Module to make anonymous functions by partial application of operators"
DESCRIPTION = "A Python module to make lambdas by partial application of python operators. \
It is inspired by the Perl 6 one, see http://perlcabal.org/syn/S02.html#The_Whatever_Object"
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python39-whatever-0.7-1.4.noarch.rpm"
RPM_HASH = "55b23356ddacbb3f938630e1ba634c7207fef20f34f3d7567775aaaf6b86eacb57a817f8eba721c04eff4926aa76e311aa6fac2a80576cfa5323105e10f9d93a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-whatever \
python39-whatever \
python3dist-whatever"

RDEPENDS:${PN} += "python-abi"

inherit rpm
