SUMMARY = "A Python wrapper library for subprocess module"
DESCRIPTION = "A Python wrapper library for subprocess module."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-subprocrunner-2.0.0-2.5.noarch.rpm"
RPM_HASH = "c98c2fb615510493c6603ea246c6e4e0e0a1d3465e7983772011fd66011446c1f2e3d7f35a78e72a4d3a8ec9d0c1b64a07a126a5bf2c3d26bab234dfbc4030eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-subprocrunner \
python39-subprocrunner \
python3dist-subprocrunner"

RDEPENDS:${PN} += "python-abi \
python39-loguru \
python39-mbstrdecoder \
python39-typepy"

inherit rpm
