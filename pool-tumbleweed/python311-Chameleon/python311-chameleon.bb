SUMMARY = "Fast HTML/XML Template Compiler"
DESCRIPTION = "Chameleon is an HTML/XML template engine for Python. It uses the \
*page templates* language. \
 \
You can use it in any Python web application with just about any \
version of Python (2.5 and up, including 3.x and pypy)."
LICENSE = "BSD-3-Clause & BSD-4-Clause & Python-2.0 & ZPL-2.1"

PV = "3.10.2"

RPM_NAME = "python311-Chameleon-3.10.2-1.5.noarch.rpm"
RPM_HASH = "e9543d3c563efbf5e9622ebcfaf741d24456a8dcb62ea948ce6ca36d2fb63a81644dc03c309f90ea55ab6811b6e2598b421d7b4d3a9dec6b9478ed6eed47616e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Chameleon \
python3.11dist-chameleon \
python311-Chameleon \
python3dist-chameleon"

RDEPENDS:${PN} += "python-abi \
python311-setuptools"

inherit rpm
