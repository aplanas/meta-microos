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

RPM_NAME = "python39-pystache-0.6.0-2.1.noarch.rpm"
RPM_HASH = "cb1f6539a72bca9b98e275315c0dfacdd88a7f30e64a2df73cd7cb5f19409b6c4558d4a0e762d5e34e6635c6a425d22dd29bbb6e040b77b3333efa3a8845fe01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pystache \
python39-pystache \
python3dist-pystache"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
