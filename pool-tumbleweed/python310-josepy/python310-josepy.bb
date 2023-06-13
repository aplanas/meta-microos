SUMMARY = "JOSE protocol implementation in Python"
DESCRIPTION = "JOSE protocol implementation in Python using cryptography. \
It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "python310-josepy-1.13.0-1.6.noarch.rpm"
RPM_HASH = "75e5e08983fe672cb5bb2242b4ab524509d7745eeb3a0e6c0b9450878a6da8bd708db93ff6efcdbc3227c5f7cef334d9899dde61183764c3670f9f93646fa8ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-josepy \
python3.10dist(josepy) \
python310-josepy \
python3dist(josepy)"

RDEPENDS:${PN} += "python(abi) \
python310-cryptography \
python310-pyOpenSSL"

inherit rpm
