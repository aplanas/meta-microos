SUMMARY = "Library for the Common ISDN Application Programming Interface"
DESCRIPTION = "libcapi handles requests from CAPI-driven applications such as fax \
systems via active and passive ISDN cards."
LICENSE = "LGPL-2.1-or-later"

PV = "3.27"

RPM_NAME = "libcapi20-3.27-2.9.aarch64.rpm"
RPM_HASH = "5c0e5709360fafbbccf70e48e1e20c4f0cfdeb76b83610d588f274a8394f311b91d6236575424f856fd04df6484ff9431a2917f527432b8b6f73ed7d653ec9c1"

RPROVIDES:${PN} += "libcapi20"

RDEPENDS:${PN} += ""

inherit rpm
