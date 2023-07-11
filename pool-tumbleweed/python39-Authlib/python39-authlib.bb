SUMMARY = "Python library for building OAuth and OpenID Connect servers"
DESCRIPTION = "A Python library for building OAuth and OpenID Connect servers."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python39-Authlib-1.2.1-1.1.noarch.rpm"
RPM_HASH = "56123633e1ca97a2b0c6e357517a290e11b16f3c45f5b3cbf11752eb4ec14b7b843d781f13fe886dde4f3a37191c15cd8d8e800c672730781c831a0dc36fdabb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-authlib \
python39-Authlib \
python3dist-authlib"

RDEPENDS:${PN} += "python-abi \
python39-cryptography"

inherit rpm
