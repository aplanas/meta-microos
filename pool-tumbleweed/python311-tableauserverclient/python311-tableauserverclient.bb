SUMMARY = "Python library for working with the Tableau Server REST API"
DESCRIPTION = "A Python module for working with the Tableau Server REST API."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python311-tableauserverclient-0.18.0-1.9.noarch.rpm"
RPM_HASH = "831e6dff856721b9edcf6c35eb9eaaf14234c5548d95ff8ed5b05c6a4a342df285880d0eb8f03b1c4fb56b0e5a0d3665743a5d438065cdd5e6acdb7ed434b35f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tableauserverclient \
python3.11dist-tableauserverclient \
python311-tableauserverclient \
python3dist-tableauserverclient"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
