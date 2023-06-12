SUMMARY = "An implementation of lxml.xmlfile for the standard library"
DESCRIPTION = "et_xmlfile is a low memory library for creating large XML files. \
 \
It is based upon the xmlfile module from lxml with the aim of allowing code to \
be developed that will work with both libraries. It was developed initially for \
the openpyxl project but is now a standalone module."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-et_xmlfile-1.0.1-4.1.noarch.rpm"
RPM_HASH = "70e58c5d3d0c150574cf6d47a5ba866fc3e7dd08f694d156baeed38679aaa34510eb009949145bf3fd205c5026780d6a5614f843200cf7386f50edd25672f40b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-et_xmlfile \
python3.10dist(et-xmlfile) \
python310-et_xmlfile \
python3dist(et-xmlfile)"
RDEPENDS:${PN} += "python(abi) \
python310-jdcal \
python310-lxml"

inherit rpm
