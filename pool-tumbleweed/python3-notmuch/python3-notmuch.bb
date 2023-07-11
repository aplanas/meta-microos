SUMMARY = "Python3 bindings for notmuch"
DESCRIPTION = "Python3 interface (bindings) for notmuch"
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "python3-notmuch-0.37-2.6.aarch64.rpm"
RPM_HASH = "4e0c4bf5b0c8dd554e7cce28d095b7e552981c45f5d072b64b492f0de569823c3a02aa14568059f2e5561eab78892c7a1eb5883590a7e965e3fc20da0b79ec09"

RPROVIDES:${PN} += "python3-notmuch \
python3.11dist-notmuch \
python3dist-notmuch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
