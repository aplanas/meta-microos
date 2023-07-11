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

RPM_NAME = "python311-pystache-0.6.0-1.18.noarch.rpm"
RPM_HASH = "79457e994e3e22d890f63bec7e7f54a3ef99a04ab27f50e36d7a463e5412c8d095ad9c7da58317cd264c82e06c42235d9f7804c20b4fa215f834eef2ffab201e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pystache \
python3.11dist-pystache \
python311-pystache \
python3dist-pystache"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm
