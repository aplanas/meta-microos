SUMMARY = "An extended implementation of JSONPath for Python"
DESCRIPTION = "This library provides a robust and significantly extended implementation \
of JSONPath for Python. It is tested with Python 2.6, 2.7, 3.2, 3.3, and PyPy. \
 \
This library differs from other JSONPath implementations in that it is a \
full *language* implementation, meaning the JSONPath expressions are \
first class objects, easy to analyze, transform, parse, print, and \
extend. (You can also execute them :-)"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python311-jsonpath-rw-1.4.0-6.15.noarch.rpm"
RPM_HASH = "28bbf9e9de19e79337d0dd536512a3184f274eb6d0c1edb3262ea41a999e89ab60781dd13ed71514e0a5ad5a500d3e77f7ad7f1f8481f2b6c416313d79d7e59e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpath-rw \
python3.11dist-jsonpath-rw \
python311-jsonpath-rw \
python3dist-jsonpath-rw"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-decorator \
python311-ply \
python311-six \
update-alternatives"

inherit rpm
