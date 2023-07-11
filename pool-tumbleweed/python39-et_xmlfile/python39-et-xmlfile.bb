SUMMARY = "An implementation of lxml.xmlfile for the standard library"
DESCRIPTION = "et_xmlfile is a low memory library for creating large XML files. \
 \
It is based upon the xmlfile module from lxml with the aim of allowing code to \
be developed that will work with both libraries. It was developed initially for \
the openpyxl project but is now a standalone module."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-et_xmlfile-1.0.1-4.3.noarch.rpm"
RPM_HASH = "233326458170a44fc5b253bccd9e2a806db05ac449359e02e3018e14d994c86fc951b873ae0f8ae5e1f2301c6c77cb4cab0df1a2b0bb344af16450d27b6114cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-et-xmlfile \
python39-et-xmlfile \
python3dist-et-xmlfile"

RDEPENDS:${PN} += "python-abi \
python39-jdcal \
python39-lxml"

inherit rpm
