SUMMARY = "Python runtime inspection utilities for typing"
DESCRIPTION = "Python runtime inspection utilities for typing module."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python39-typing-inspect-0.8.0-2.1.noarch.rpm"
RPM_HASH = "763373f6e3f1fb034e8f7896fd0c95a282092d6f9f311394008496badf1acdecdce5baddb18fe67a6001fc4a80319d9b87fd1faad2a669bffda85ebb323d01c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(typing-inspect) \
python39-typing-inspect \
python3dist(typing-inspect)"
RDEPENDS:${PN} += "python(abi) \
python39-mypy_extensions \
python39-typing_extensions"

inherit rpm
