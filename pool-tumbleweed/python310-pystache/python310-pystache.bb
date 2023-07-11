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

RPM_NAME = "python310-pystache-0.6.0-1.18.noarch.rpm"
RPM_HASH = "40faaacec5a726d4910a3f3f800bc2434c6a126c7331be55c89f2b4b95d54f51932dbadb640c13e0375f106888bc04c4e5e0ab4dd36cf919a569a335136a9636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pystache \
python310-pystache \
python3dist-pystache"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
