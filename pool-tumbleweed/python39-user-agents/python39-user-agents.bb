SUMMARY = "A library to identify device capabilities (phones, tablets)"
DESCRIPTION = "Python library that can identify/detect devices like mobile phones, \
tablets and their capabilities by parsing (browser/HTTP) user agent \
strings."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python39-user-agents-2.2.0-1.1.noarch.rpm"
RPM_HASH = "d41d3768102a5c24e1304e8a2a612987cd7b849b75dc8c25ac91ea5992b8e924812fe8c5369ff46d7b79101753745a4b411dc6bd0c73137d071d06a803629e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-user-agents \
python39-user-agents \
python3dist-user-agents"

RDEPENDS:${PN} += "python-abi \
python39-ua-parser"

inherit rpm
