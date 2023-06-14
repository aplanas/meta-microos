SUMMARY = "Fast HTML/XML Template Compiler"
DESCRIPTION = "Chameleon is an HTML/XML template engine for Python. It uses the \
*page templates* language. \
 \
You can use it in any Python web application with just about any \
version of Python (2.5 and up, including 3.x and pypy)."
LICENSE = "BSD-3-Clause & BSD-4-Clause & Python-2.0 & ZPL-2.1"

PV = "3.10.2"

RPM_NAME = "python39-Chameleon-3.10.2-1.3.noarch.rpm"
RPM_HASH = "73bb26a14dc3b6205cff96809d79e72cd85fa33ca07ae716a9ec6d24e11b98ba1f04915076b916d69b6e65b1d6f6865f72d611a34772c2f6a05f256efea6aaba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-chameleon \
python39-Chameleon \
python3dist-chameleon"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
