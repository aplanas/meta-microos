SUMMARY = "A library to identify device capabilities (phones, tablets)"
DESCRIPTION = "Python library that can identify/detect devices like mobile phones, \
tablets and their capabilities by parsing (browser/HTTP) user agent \
strings."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-user-agents-2.1.0-1.15.noarch.rpm"
RPM_HASH = "3a88aebec2dde9e9e47bc6ba1436858e2b5d1555a389c6e14bcecbb3079937ecfa7b5f48371d045214122d51d2cc614795784320c8fd9a12458df2f4c014b265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-user-agents \
python310-user-agents \
python3dist-user-agents"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-ua-parser"

inherit rpm
