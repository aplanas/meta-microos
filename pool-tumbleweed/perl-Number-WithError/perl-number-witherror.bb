SUMMARY = "Numbers with error propagation and scientific rounding"
DESCRIPTION = "This class is a container class for numbers with a number of associated \
symmetric and asymmetric errors. It overloads practically all common \
arithmetic operations and trigonometric functions to propagate the errors. \
It can do proper scientific rounding (as explained in more detail below in \
the documentation of the 'significant_digit()' method). \
 \
You can use Math::BigFloat objects as the internal representation of \
numbers in order to support arbitrary precision calculations. \
 \
Errors are propagated using Gaussian error propagation. \
 \
With a notable exception, the test suite covers way over ninety percent of \
the code. The remaining holes are mostly difficult-to-test corner cases and \
sanity tests. The comparison routines are the exception for which there \
will be more extensive tests in a future release."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Number-WithError-1.01-1.19.noarch.rpm"
RPM_HASH = "928739a14478797dec5dd344abadc81f538373b7647aea0d915e110b420b0c41895df8e7df4ebf587948405a466e25635ec04f638207c3a9ff9dcd13e4a3d9fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Number--WithError \
perl-Number-WithError"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Params--Util \
perl-prefork"

inherit rpm
