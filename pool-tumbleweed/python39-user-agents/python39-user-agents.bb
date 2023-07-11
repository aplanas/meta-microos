SUMMARY = "A library to identify device capabilities (phones, tablets)"
DESCRIPTION = "Python library that can identify/detect devices like mobile phones, \
tablets and their capabilities by parsing (browser/HTTP) user agent \
strings."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-user-agents-2.1.0-1.15.noarch.rpm"
RPM_HASH = "5db2c2e1193e9e6834882c9173c8407df410b429b654257b5cc6582ee9b64df11efbe8a513a6276876b070adbae2118e4106b44fbb328ebff3995234a1c228dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-user-agents \
python39-user-agents \
python3dist-user-agents"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-ua-parser"

inherit rpm
