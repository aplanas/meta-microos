SUMMARY = "Single-source support for Python 3 and 2"
DESCRIPTION = "Future is a compatibility layer between Python 2 and Python 3. \
It allows you to use a single Python 3.x-compatible codebase to \
support both Python 2 and Python 3."
LICENSE = "MIT & Python-2.0"

PV = "0.18.3"

RPM_NAME = "python311-future-0.18.3-4.1.noarch.rpm"
RPM_HASH = "ab10280b25df04813ec82a947cb46f8dc9fbe776f48e0ca24d9195984b220d8b7e7ef5f25c89f5459fba0898e355a6dbb21bb338483513f1e3d4fd595dedea6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-future \
python3.11dist-future \
python311-future \
python3dist-future"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
