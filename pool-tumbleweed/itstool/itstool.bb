SUMMARY = "Tool to translate XML documents using PO files"
DESCRIPTION = "ITS Tool extracts messages from XML files and outputs PO template files, then \
merges translations from MO files to create translated XML files. It determines \
what to translate and how to chunk it into messages using the W3C \
Internationalization Tag Set (ITS)."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.7"

RPM_NAME = "itstool-2.0.7-1.6.noarch.rpm"
RPM_HASH = "28940654d85b7a136953e3a1a687c15ce106d41e2ba93ed75b55f9b5590e39f6adff33a54c97bcc3db6a78068bdef58c18994a5b5f08492d3f23221f3990a8d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itstool"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-libxml2"

inherit rpm
