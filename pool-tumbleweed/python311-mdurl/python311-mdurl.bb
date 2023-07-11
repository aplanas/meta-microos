SUMMARY = "Markdown URL utilities"
DESCRIPTION = "A Python port of the JavaScript mdurl package. Formats and parses URLs in Markdown-Format."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-mdurl-0.1.2-2.3.noarch.rpm"
RPM_HASH = "33f4e1e8b9fcdd81a215b5babbe931b5e135609547da15c550cc19996931a291257b00c6138074f7f68dafdd30dd6ace986c156a22927ff3c3ea313b93ce9716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mdurl \
python3.11dist-mdurl \
python311-mdurl \
python3dist-mdurl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
