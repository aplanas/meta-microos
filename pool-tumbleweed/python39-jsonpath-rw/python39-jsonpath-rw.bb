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

RPM_NAME = "python39-jsonpath-rw-1.4.0-6.15.noarch.rpm"
RPM_HASH = "7c426a442153770e3f052f6f6d343278a1a1e3b6ffc6141a2782a6ec09f79a49ccd7249435bfaf13c4cbe94c6c33ebcf50087a1254152183a1f62c5e8adb37bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonpath-rw \
python39-jsonpath-rw \
python3dist-jsonpath-rw"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-decorator \
python39-ply \
python39-six \
update-alternatives"

inherit rpm
