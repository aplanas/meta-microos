SUMMARY = "Tool to extract translatable content from XML documents"
DESCRIPTION = "xml2po is a Python program which extracts translatable content from \
free-form XML documents and outputs gettext compatible POT files."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.10"

RPM_NAME = "xml2po-0.20.10-21.6.noarch.rpm"
RPM_HASH = "0603a6aa5bfbb86ccd632c2fc874f8c61f9a2324b77dedfd42fcfc5bc1fd83db668322b6793ac5327234b1a344a02a81b6bf7488de8a43d3716c70718350efcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml2po"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
