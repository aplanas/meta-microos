SUMMARY = "LuaJIT bindings for the efl"
DESCRIPTION = "A set of efl bindings for the LuaJIT environment."
LICENSE = "LGPL-2.1-only"

PV = "1.26.3"

RPM_NAME = "elua-1.26.3-30.6.aarch64.rpm"
RPM_HASH = "c7f0373b8f14237076971140e34816a77bce42c48a671204cfe542cc8386d46aa4a8f3fb8409a8474007c483c6c8a06b32ca1973da8743ce92310143e9b8cc42"

RPROVIDES:${PN} += "elua \
elua(aarch-64)"
RDEPENDS:${PN} += "efl"

inherit rpm
