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

RPM_NAME = "python310-pystache-0.6.0-2.1.noarch.rpm"
RPM_HASH = "aeb363ffbed66a0bf64681be637a32af9733af56e68c066f03480c3b491a611a2d46e32065ad95cc096a488c10f203bac4f68e9efab7280396c70263eae01a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pystache \
python310-pystache \
python3dist-pystache"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
