SUMMARY = "An implementation of lxml.xmlfile for the standard library"
DESCRIPTION = "et_xmlfile is a low memory library for creating large XML files. \
 \
It is based upon the xmlfile module from lxml with the aim of allowing code to \
be developed that will work with both libraries. It was developed initially for \
the openpyxl project but is now a standalone module."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-et_xmlfile-1.0.1-4.3.noarch.rpm"
RPM_HASH = "df826dfaf03a10068af25dcc6a5f13783dcd9c1dd3b1c68ecefdb674ed67685da844768ad1b109b07cf02486562772ef36db045befcddc8c14a9ba3c12b31c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-et-xmlfile \
python3.11dist-et-xmlfile \
python311-et-xmlfile \
python3dist-et-xmlfile"

RDEPENDS:${PN} += "python-abi \
python311-jdcal \
python311-lxml"

inherit rpm
