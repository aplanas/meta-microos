SUMMARY = "API to extract content from HTML & XML documents"
DESCRIPTION = "API to extract content from HTML & XML documents"
LICENSE = "MIT"

PV = "0.0.21"

RPM_NAME = "python311-selection-0.0.21-1.3.noarch.rpm"
RPM_HASH = "aabc005bc4277732c66a0526b63f938a025613200a4a15dbf95f9e28b84aa6032b995fcd704f256c7438950c37b94f5118bffa5efb6e401b6b568b972a76a536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-selection \
python3.11dist-selection \
python311-selection \
python3dist-selection"

RDEPENDS:${PN} += "python-abi \
python311-lxml"

inherit rpm
