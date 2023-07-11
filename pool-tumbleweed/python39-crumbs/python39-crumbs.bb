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

RPM_NAME = "python39-crumbs-2.1.1-1.13.noarch.rpm"
RPM_HASH = "8997e50998337345ada04ac2ec06fcbaac9376443d93dfcb719d912d263c23ddd82ecbeae3c23ab6fab9bf274d590cdab7e0be1362ecc5e2a73bc42b98ba717a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-crumbs \
python39-crumbs \
python3dist-crumbs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
