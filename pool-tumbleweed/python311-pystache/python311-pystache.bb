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

RPM_NAME = "python311-pystache-0.6.0-2.1.noarch.rpm"
RPM_HASH = "e416260a85696be191432e44cb52735f8297bc03f2ff28066b1415aca3b05d028ac72329e3dd29db54d2a525a331ec4da50755272d3bfd1bea79fd05b8d137e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pystache \
python3.11dist-pystache \
python311-pystache \
python3dist-pystache"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm
