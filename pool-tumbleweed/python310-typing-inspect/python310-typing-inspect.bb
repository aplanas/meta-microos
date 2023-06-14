SUMMARY = "Python runtime inspection utilities for typing"
DESCRIPTION = "Python runtime inspection utilities for typing module."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python310-typing-inspect-0.8.0-2.1.noarch.rpm"
RPM_HASH = "3bdda297e965d6f6fc8aca1cf0c995796edc09d6cb29d3ff4bad3d4002b03d3bdc80e7af13b90550f70c6389d239e922b3a723aca4dd3f6b29830293b510fa21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typing-inspect \
python3.10dist-typing-inspect \
python310-typing-inspect \
python3dist-typing-inspect"

RDEPENDS:${PN} += "python-abi \
python310-mypy-extensions \
python310-typing-extensions"

inherit rpm
