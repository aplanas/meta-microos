SUMMARY = "Python runtime inspection utilities for typing"
DESCRIPTION = "Python runtime inspection utilities for typing module."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-typing-inspect-0.9.0-1.1.noarch.rpm"
RPM_HASH = "3f2730f081bc83c232765f4a7786ff44f845495754a2b6a19c46c0fc65757b1971d64827adb875346cf500e658b5d21531a84db0d3705703a9732d4040db537d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-typing-inspect \
python310-typing-inspect \
python3dist-typing-inspect"

RDEPENDS:${PN} += "python-abi \
python310-mypy-extensions \
python310-typing-extensions"

inherit rpm
