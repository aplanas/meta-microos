SUMMARY = "Fast HTML/XML Template Compiler"
DESCRIPTION = "Chameleon is an HTML/XML template engine for Python. It uses the \
*page templates* language. \
 \
You can use it in any Python web application with just about any \
version of Python (2.5 and up, including 3.x and pypy)."
LICENSE = "BSD-3-Clause & BSD-4-Clause & Python-2.0 & ZPL-2.1"

PV = "3.10.2"

RPM_NAME = "python310-Chameleon-3.10.2-1.5.noarch.rpm"
RPM_HASH = "3a104bc7df4e390b5846006746720d81011edc6f3a6a67b2ec0f39491eb7f957764b523c5489441fb7a53679b3444186e05527373bfd80d18662085899bf8e77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-chameleon \
python310-Chameleon \
python3dist-chameleon"

RDEPENDS:${PN} += "python-abi \
python310-setuptools"

inherit rpm
