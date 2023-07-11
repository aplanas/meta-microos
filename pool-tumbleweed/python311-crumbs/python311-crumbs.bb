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

RPM_NAME = "python311-crumbs-2.1.1-1.13.noarch.rpm"
RPM_HASH = "1f310ce828055a51175f98c94690c2c39252340fd299277727b0e3a35b5b596e397e73e9f79450b3f43a7e651850e4d9cf8ca9a88c0ec306f1feb427c11d110e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crumbs \
python3.11dist-crumbs \
python311-crumbs \
python3dist-crumbs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
