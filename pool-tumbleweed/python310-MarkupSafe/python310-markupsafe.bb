SUMMARY = "Implements a XML/HTML/XHTML Markup safe string for Python"
DESCRIPTION = "Implements a unicode subclass that supports HTML strings. This can be used to \
safely encode strings for dynamically generated web pages."
LICENSE = "BSD-3-Clause"

PV = "2.1.3"

RPM_NAME = "python310-MarkupSafe-2.1.3-1.1.aarch64.rpm"
RPM_HASH = "7459fb5a5905f931191d75064be52343f8fd0dd680d8a4fba50e84d89d78eed3ea9c6b1bf6f3530311519e50949d55a3969564cfa0003d4df412136ba057a45a"

RPROVIDES:${PN} += "python3.10dist-markupsafe \
python310-MarkupSafe \
python3dist-markupsafe"

RDEPENDS:${PN} += "libc.so.6 \
python-abi \
python310-base"

inherit rpm
