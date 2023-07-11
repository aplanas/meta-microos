SUMMARY = "CLI, cURL-like tool for humans"
DESCRIPTION = "HTTPie consists of a single 'http' command designed for debugging and \
interaction with HTTP servers, RESTful APIs, and web services. \
 \
It allows for issuing arbitrary HTTP requests and displays colorized \
responses."
LICENSE = "BSD-3-Clause"

PV = "3.2.2"

RPM_NAME = "httpie-3.2.2-3.1.noarch.rpm"
RPM_HASH = "382bcf0a50dafb325fc1441a27140334d0a66706d8033f0851b9678d007f8e9fce386cac235b314fc2b18d441093260060b6ad9ac7b05959822e01799c3cb431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpie \
python3-httpie \
python3.11dist-httpie \
python311-httpie \
python3dist-httpie"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi \
python311 \
python311-PySocks \
python311-Pygments \
python311-charset-normalizer \
python311-defusedxml \
python311-multidict \
python311-pip \
python311-requests \
python311-requests-toolbelt \
python311-rich \
python311-setuptools \
update-alternatives"

inherit rpm
