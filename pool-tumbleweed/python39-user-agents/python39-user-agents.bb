SUMMARY = "A library to identify device capabilities (phones, tablets)"
DESCRIPTION = "Python library that can identify/detect devices like mobile phones, \
tablets and their capabilities by parsing (browser/HTTP) user agent \
strings."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-user-agents-2.1.0-1.13.noarch.rpm"
RPM_HASH = "2d4c43ecd2edcffa843a86104361a82d705d5b8daa7c50f191e1965835349fd1323170585b65195fb0961ddf421fe46ab2612229b050e44a7494dbe2c115ed24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-user-agents \
python39-user-agents \
python3dist-user-agents"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-ua-parser"

inherit rpm
