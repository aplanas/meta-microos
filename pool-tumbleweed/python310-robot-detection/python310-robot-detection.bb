SUMMARY = "HTTP User Agent Bot Detection"
DESCRIPTION = "Library for detecting if a HTTP User Agent header is likely to be a bot."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "python310-robot-detection-0.4.0-3.1.noarch.rpm"
RPM_HASH = "bbb3c67250f7fc6ea58b09192e6bf2fee44a21f99751e84926820997f2e302fb403f8f7f4c48f3213ded7c62e6d1a56a18d61f451a90defbae58b7a8c1be68c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-robot-detection \
python310-robot-detection \
python3dist-robot-detection"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
