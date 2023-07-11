SUMMARY = "Python runtime inspection utilities for typing"
DESCRIPTION = "Python runtime inspection utilities for typing module."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python310-typing-inspect-0.8.0-2.3.noarch.rpm"
RPM_HASH = "181975f7a89958691acae0aaf19c68277a526c37bd24879a4b8f83a3b4917169dee690388d54dfd8b1dc394c108fe46a4ba96e5ff18b59e73fcafe46f56f2fab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-typing-inspect \
python310-typing-inspect \
python3dist-typing-inspect"

RDEPENDS:${PN} += "python-abi \
python310-mypy-extensions \
python310-typing-extensions"

inherit rpm
