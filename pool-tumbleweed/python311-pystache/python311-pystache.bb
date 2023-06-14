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

RPM_NAME = "python311-pystache-0.6.0-1.16.noarch.rpm"
RPM_HASH = "a51b6fbee235a868c637f6e10f20e85614833c431d201f14c50c319cd0b3b1f82b52de8bab42098296b33a9b4e56c4617a9c6960561eabbf29e74f624582444f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pystache \
python311-pystache \
python3dist-pystache"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi"

inherit rpm
