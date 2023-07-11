SUMMARY = "Python HTTP client with async support"
DESCRIPTION = "Python HTTP client with async support."
LICENSE = "BSD-3-Clause"

PV = "0.24.0"

RPM_NAME = "python311-httpx-0.24.0-1.2.noarch.rpm"
RPM_HASH = "d5dff6894fb3a73a0a12901501b43c01ec8664a941b470feb95c0c17bbd5fa3e9e9b663451b015e822a88bfaaa825c89f0c8cb2c138c808ead7967853224ff1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpx \
python3.11dist-httpx \
python311-httpx \
python3dist-httpx"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-certifi \
python311-httpcore \
python311-idna \
python311-sniffio \
update-alternatives"

inherit rpm
