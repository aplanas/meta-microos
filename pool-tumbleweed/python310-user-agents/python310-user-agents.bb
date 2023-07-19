SUMMARY = "A library to identify device capabilities (phones, tablets)"
DESCRIPTION = "Python library that can identify/detect devices like mobile phones, \
tablets and their capabilities by parsing (browser/HTTP) user agent \
strings."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python310-user-agents-2.2.0-1.1.noarch.rpm"
RPM_HASH = "bb941280a0859ef2fa71677ee494181dfa751a23d95b3ffff9ad40b9906e4f9d1e2ec0dab03b802ddf5ddf5400e137c70428144e31c55d42338b99d073b5e957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-user-agents \
python310-user-agents \
python3dist-user-agents"

RDEPENDS:${PN} += "python-abi \
python310-ua-parser"

inherit rpm
