SUMMARY = "Generalized all-in-one parameters module"
DESCRIPTION = "This package provides a single interface to environment variables', \
configuration files', and command line arguments' provided values.  The \
dictionary-like interface makes interacting with these, most of the time \
disparate, resources much simpler.  It also allows parameters' values to be set \
in any of the three sources and selects an appropriate value when a parameter's \
value is specified in multiple sources.  This way the most expected value, \
according to the normal prcedence—command line arguments then configuration \
files then environment variables, is always returned."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python311-crumbs-2.1.1-1.12.noarch.rpm"
RPM_HASH = "0689b7e5551404fcf459c2630db236f95c2198890ca6b05e91b49a08a06c4562c572e00e345050d6c3b188a88b9d01bcbd863eb65a728742e2cd160703a93c7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-crumbs \
python311-crumbs \
python3dist-crumbs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
