SUMMARY = "A library to identify device capabilities (phones, tablets)"
DESCRIPTION = "Python library that can identify/detect devices like mobile phones, \
tablets and their capabilities by parsing (browser/HTTP) user agent \
strings."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-user-agents-2.1.0-1.15.noarch.rpm"
RPM_HASH = "f1ea4eef239082c062f1ec2eea0c3077f01a131ccf07d84a95c1e48f46de05cf9c4872728dee83b8679e605f20051b25fab386b71361a03dbc2dc1754c693148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-user-agents \
python3.11dist-user-agents \
python311-user-agents \
python3dist-user-agents"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-ua-parser"

inherit rpm
