SUMMARY = "Fast HTML/XML Template Compiler"
DESCRIPTION = "Chameleon is an HTML/XML template engine for Python. It uses the \
*page templates* language. \
 \
You can use it in any Python web application with just about any \
version of Python (2.5 and up, including 3.x and pypy)."
LICENSE = "BSD-3-Clause & BSD-4-Clause & Python-2.0 & ZPL-2.1"

PV = "3.10.2"

RPM_NAME = "python310-Chameleon-3.10.2-1.3.noarch.rpm"
RPM_HASH = "a1661f575c0965598e93442d4eede8ea97cd816adcaf445a6c209b82e77bfc66a1548be92c2f6424085fc8b591e9d418ea901846bc024ce634430308c47c1201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Chameleon \
python3.10dist(chameleon) \
python310-Chameleon \
python3dist(chameleon)"

RDEPENDS:${PN} += "python(abi) \
python310-setuptools"

inherit rpm
