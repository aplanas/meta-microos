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

RPM_NAME = "python39-crumbs-2.1.1-1.12.noarch.rpm"
RPM_HASH = "703c09ebf203303871fc0d63ef900bd2e8a478925f11f5f1d7bb6477835a11a24546d47084cc29f4350d6885741a62654cfb694d8d2638470d6435d29ff163b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(crumbs) \
python39-crumbs \
python3dist(crumbs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
