SUMMARY = "Connman reference man pages"
DESCRIPTION = "Documentation in form of man pages for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-doc-1.41-4.7.aarch64.rpm"
RPM_HASH = "91f1aa2515697474baeb077234c64c11b59956a97f8a5c8a5f40b8078a11fc8af8ae75a76c6405bebe43f966e331a162373a63936588af02b6024faa2b09389e"

RPROVIDES:${PN} += "connman-doc \
connman-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
