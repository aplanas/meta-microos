SUMMARY = "Python library for building OAuth and OpenID Connect servers"
DESCRIPTION = "A Python library for building OAuth and OpenID Connect servers."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-Authlib-1.2.1-1.1.noarch.rpm"
RPM_HASH = "5c32bb0e1c42d14f5624b775c5bde0949ab41b2aef1a8adb50d6b0d40a6cc59f41ad0ff5b4a2f2faf9b02aabc29e5aba15515ff27a326e5b026af3afe8e09da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Authlib \
python3.11dist-authlib \
python311-Authlib \
python3dist-authlib"

RDEPENDS:${PN} += "python-abi \
python311-cryptography"

inherit rpm
