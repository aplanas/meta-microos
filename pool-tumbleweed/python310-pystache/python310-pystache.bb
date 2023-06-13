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

RPM_NAME = "python310-pystache-0.6.0-1.16.noarch.rpm"
RPM_HASH = "a07d0066e6a60458a2f4049281f8bd378a58d1498d9196f79e9b3e193f268e7c64afb3f05c585226bd3ce53b9caf1b21dca277a4ae3ea04530a9ff1e40f95e48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pystache \
python3.10dist(pystache) \
python310-pystache \
python3dist(pystache)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi)"

inherit rpm
