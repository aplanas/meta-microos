SUMMARY = "Fast HTML/XML Template Compiler"
DESCRIPTION = "Chameleon is an HTML/XML template engine for Python. It uses the \
*page templates* language. \
 \
You can use it in any Python web application with just about any \
version of Python (2.5 and up, including 3.x and pypy)."
LICENSE = "BSD-3-Clause & BSD-4-Clause & Python-2.0 & ZPL-2.1"

PV = "3.10.2"

RPM_NAME = "python39-Chameleon-3.10.2-1.5.noarch.rpm"
RPM_HASH = "23e78aff064e5f5d24980b9507d157156f6165e74885cadd4509a36d2d1e90c4372766ada3378bf37c480f21ac1c5f74bc4a289827f8543112ba73997d1121ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-chameleon \
python39-Chameleon \
python3dist-chameleon"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
