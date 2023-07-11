SUMMARY = "Application tools in Python"
DESCRIPTION = "The apptools project includes a set of packages that Enthought has found \
useful in creating a number of applications.  They implement functionality \
that is commonly needed by many applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-3.0-only"

PV = "5.2.0"

RPM_NAME = "python311-apptools-5.2.0-1.5.noarch.rpm"
RPM_HASH = "983a72861687c30ff13eaa959b0e607c00730b302eccb297889b0daaaa7bc6e7b8199b11d502049620189d838285ac236b12d70f9895c3a62237e1be11a90879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apptools \
python3.11dist-apptools \
python311-apptools \
python3dist-apptools"

RDEPENDS:${PN} += "python-abi \
python311-configobj \
python311-traits"

inherit rpm
