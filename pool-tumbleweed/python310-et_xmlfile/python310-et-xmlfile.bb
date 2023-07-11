SUMMARY = "An implementation of lxml.xmlfile for the standard library"
DESCRIPTION = "et_xmlfile is a low memory library for creating large XML files. \
 \
It is based upon the xmlfile module from lxml with the aim of allowing code to \
be developed that will work with both libraries. It was developed initially for \
the openpyxl project but is now a standalone module."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-et_xmlfile-1.0.1-4.3.noarch.rpm"
RPM_HASH = "f70e748bf7bc0f6faa71247a4ba5860896c19014a97b2042bc94cea5e717b8db69cb0736a9f39d0b84f7588097c1999bf9a0aa00c390d29efe8f3945bf6ecacc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-et-xmlfile \
python310-et-xmlfile \
python3dist-et-xmlfile"

RDEPENDS:${PN} += "python-abi \
python310-jdcal \
python310-lxml"

inherit rpm
