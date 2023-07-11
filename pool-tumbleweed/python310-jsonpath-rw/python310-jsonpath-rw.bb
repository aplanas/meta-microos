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

RPM_NAME = "python310-jsonpath-rw-1.4.0-6.15.noarch.rpm"
RPM_HASH = "9a23b08e86095e706a8120d219541b45743747cd356ba257ff90503cdfc33cac9eff64111513acec84c55bbe6d54394a205ce38bcaae420b47cf7505b7bc492a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonpath-rw \
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
