SUMMARY = "Mustache for Python"
DESCRIPTION = "Pystache is a Python implementation of Mustache. Mustache is a \
framework-agnostic, logic-free templating system inspired by \
ctemplate and etc. Like ctemplate, Mustache 'emphasises separating \
logic from presentation: it is impossible to embed application \
logic in this template language.' \
 \
The mustache(5) man page provides a good introduction to Mustache's \
syntax. For a more complete (and more current) description of \
Mustache's behaviour, see the official Mustache spec: \
https://github.com/mustache/spec."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-pystache-0.6.0-1.16.noarch.rpm"
RPM_HASH = "d5c0c8fb503b95b34e5ca68757e1ae8c8813f22f12f987ee2f5efd62f029f4ef841d4ef6d13eca94c6b0a847d5e8aafda65fbe32863672103105b155b4c32e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pystache \
python39-pystache \
python3dist-pystache"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
