SUMMARY = "Implements a XML/HTML/XHTML Markup safe string for Python"
DESCRIPTION = "Implements a unicode subclass that supports HTML strings. This can be used to \
safely encode strings for dynamically generated web pages."
LICENSE = "BSD-3-Clause"

PV = "2.1.3"

RPM_NAME = "python39-MarkupSafe-2.1.3-1.1.aarch64.rpm"
RPM_HASH = "2ef8439463d1f622a09494ec6f993a94eed420bbc108dc54f3a6c5de0f65b126420b68a7aa6d3940c2c8c1298229b6eee4933ec283293cfb667739900907e3de"

RPROVIDES:${PN} += "python3.9dist-markupsafe \
python39-MarkupSafe \
python3dist-markupsafe"

RDEPENDS:${PN} += "libc.so.6 \
python-abi \
python39-base"

inherit rpm
