SUMMARY = "Single-source support for Python 3 and 2"
DESCRIPTION = "Future is a compatibility layer between Python 2 and Python 3. \
It allows you to use a single Python 3.x-compatible codebase to \
support both Python 2 and Python 3."
LICENSE = "MIT & Python-2.0"

PV = "0.18.3"

RPM_NAME = "python311-future-0.18.3-3.1.noarch.rpm"
RPM_HASH = "28c347ef1aa710d8d11e9db7b256b55a253028d8bffbd594a814b9c9eabfdd89e498abb284c79d0db07cb8c7ef4d5291dd6a1a5c1d3d9090a725f9509e044ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(future) \
python311-future \
python3dist(future)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
