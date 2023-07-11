SUMMARY = "YUI CSS compression algorithm"
DESCRIPTION = "This is a Python port of the YUI CSS Compressor."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.2.0"

RPM_NAME = "python310-cssmin-0.2.0-1.6.noarch.rpm"
RPM_HASH = "6c3024f7b1cf290c0ebe56f0067593f7c3d2a750b26f930fda9a572d52044cf51733238df326fa56ea147cba1fe3373984dc709517adc9aa072ce6317b40e288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cssmin \
python310-cssmin \
python3dist-cssmin"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
