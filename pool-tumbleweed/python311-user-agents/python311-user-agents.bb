SUMMARY = "A library to identify device capabilities (phones, tablets)"
DESCRIPTION = "Python library that can identify/detect devices like mobile phones, \
tablets and their capabilities by parsing (browser/HTTP) user agent \
strings."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python311-user-agents-2.2.0-1.1.noarch.rpm"
RPM_HASH = "039b30bbeb212ac02057b706df7b59d71efabb3be272f9989c0e455bbae708eb38d49b81a984225938775f2cf71c635143622f5f1c44c93a098a45930d556df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-user-agents \
python3.11dist-user-agents \
python311-user-agents \
python3dist-user-agents"

RDEPENDS:${PN} += "python-abi \
python311-ua-parser"

inherit rpm
