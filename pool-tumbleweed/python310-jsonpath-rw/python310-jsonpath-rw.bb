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

RPM_NAME = "python310-jsonpath-rw-1.4.0-6.13.noarch.rpm"
RPM_HASH = "f95b90bc5d2697ea6822e6d65f12ffe1ea486fdb9b22059bff9d8327ef6a7f08175218919dbb11e7fa1c8192cee90a1bf3ed4a539e21f03602359fa19ffd9f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpath-rw \
python3.10dist-jsonpath-rw \
python310-jsonpath-rw \
python3dist-jsonpath-rw"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-decorator \
python310-ply \
python310-six \
update-alternatives"

inherit rpm
