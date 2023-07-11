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

RPM_NAME = "python310-crumbs-2.1.1-1.13.noarch.rpm"
RPM_HASH = "6df3808af97a7dbbbf302850a4bc331a6e176ae6fbd1c5107b186d3aea05bc8b9135d5ec9fb1acd85bc3c0940b7c4887ef50a24bc35e86197c872ced3a9bceac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-crumbs \
python310-crumbs \
python3dist-crumbs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
