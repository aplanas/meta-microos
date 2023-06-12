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

RPM_NAME = "python310-crumbs-2.1.1-1.12.noarch.rpm"
RPM_HASH = "4f3ccedaf7eb8e0f5b4654dba334f86975f8c3014951af5c7f1b645f0c43febe1633e3ec38b27b9de42649636155df4e08d10d8b69de78f93da297856ab755dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crumbs \
python3.10dist(crumbs) \
python310-crumbs \
python3dist(crumbs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
