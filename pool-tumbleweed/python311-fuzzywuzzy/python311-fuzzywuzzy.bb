SUMMARY = "Fuzzy string matching in python"
DESCRIPTION = "Fuzzy string matching in python"
LICENSE = "GPL-2.0-only"

PV = "0.18.0"

RPM_NAME = "python311-fuzzywuzzy-0.18.0-2.10.noarch.rpm"
RPM_HASH = "745056192dd055adedf7b7cf2c98212740c2401f58c060c6613bd0fad1c7da8a328fdf661aae75c5b6c8e70dfe920d28c684082be09c84aa4d85a169bd4a73d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fuzzywuzzy \
python3.11dist-fuzzywuzzy \
python311-fuzzywuzzy \
python3dist-fuzzywuzzy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
