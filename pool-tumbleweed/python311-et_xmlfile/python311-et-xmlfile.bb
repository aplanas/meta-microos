SUMMARY = "An implementation of lxml.xmlfile for the standard library"
DESCRIPTION = "et_xmlfile is a low memory library for creating large XML files. \
 \
It is based upon the xmlfile module from lxml with the aim of allowing code to \
be developed that will work with both libraries. It was developed initially for \
the openpyxl project but is now a standalone module."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-et_xmlfile-1.0.1-4.1.noarch.rpm"
RPM_HASH = "904db5293c1425059a7e4268989f4d8c7c23ea1c711f40b2f474d1f7786cbf45cb1a219f8cef6adaebd9ef3eb93571dd99991fc09d0f595c967af47037f0b5df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-et-xmlfile \
python311-et-xmlfile \
python3dist-et-xmlfile"

RDEPENDS:${PN} += "python-abi \
python311-jdcal \
python311-lxml"

inherit rpm
