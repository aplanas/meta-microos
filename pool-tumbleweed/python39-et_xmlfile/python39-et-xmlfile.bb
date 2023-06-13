SUMMARY = "An implementation of lxml.xmlfile for the standard library"
DESCRIPTION = "et_xmlfile is a low memory library for creating large XML files. \
 \
It is based upon the xmlfile module from lxml with the aim of allowing code to \
be developed that will work with both libraries. It was developed initially for \
the openpyxl project but is now a standalone module."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-et_xmlfile-1.0.1-4.1.noarch.rpm"
RPM_HASH = "c59afca4c1e600c42ace19ce9ff65001d837d71432f7398b99510bbee2003cdbfa3029c20a99a55839f8db8548bf6426a4943745dda9d2821072ba1a2bb8650c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(et-xmlfile) \
python39-et_xmlfile \
python3dist(et-xmlfile)"

RDEPENDS:${PN} += "python(abi) \
python39-jdcal \
python39-lxml"

inherit rpm
