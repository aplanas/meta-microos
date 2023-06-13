SUMMARY = "Single-source support for Python 3 and 2"
DESCRIPTION = "Future is a compatibility layer between Python 2 and Python 3. \
It allows you to use a single Python 3.x-compatible codebase to \
support both Python 2 and Python 3."
LICENSE = "MIT & Python-2.0"

PV = "0.18.3"

RPM_NAME = "python39-future-0.18.3-3.1.noarch.rpm"
RPM_HASH = "bddd181a5abdc1060f4840e992ff5ec970926cc5843db90fe7b19f9b6129f783637c18c856f0d7c411478f4dba3636ab1f250616c398a952d4138ce777fabda3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(future) \
python39-future \
python3dist(future)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
