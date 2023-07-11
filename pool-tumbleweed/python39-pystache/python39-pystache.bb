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

RPM_NAME = "python39-pystache-0.6.0-1.18.noarch.rpm"
RPM_HASH = "52408cc5d97734596641d1b279e9a65734d5c4ae9577ac39c6c558c2f5f47f40c796f6308f03b2e5c4789854218dedcadee7b67630132471a7a7a220233590e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pystache \
python39-pystache \
python3dist-pystache"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
