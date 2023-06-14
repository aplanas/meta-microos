SUMMARY = "API to extract content from HTML & XML documents"
DESCRIPTION = "API to extract content from HTML & XML documents"
LICENSE = "MIT"

PV = "0.0.14"

RPM_NAME = "python311-selection-0.0.14-1.16.noarch.rpm"
RPM_HASH = "a4dc63bf8587c0b051555ac15b2dfdbbb1f249729435abb96bd833a4abab4395d548eb9dd8dc315c1ad0f60482e4e942185718d6108aafbf1c791a98bc7b8a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-selection \
python311-selection \
python3dist-selection"

RDEPENDS:${PN} += "python-abi \
python311-lxml \
python311-six \
python311-weblib"

inherit rpm
