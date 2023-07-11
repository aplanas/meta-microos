SUMMARY = "Additional documentation for form - A Symbolic Manipulation System"
DESCRIPTION = "FORM is a Symbolic Manipulation System. It reads symbolic expressions from files \
and executes symbolic/algebraic transformations upon them. The answers are \
returned in a textual mathematical representation. As its landmark feature, the \
size of the considered expressions in FORM is only limited by the available \
disk space and not by the available RAM. \
 \
This package provides additional documentation for form."
LICENSE = "GPL-3.0-or-later"

PV = "4.3.0"

RPM_NAME = "form-doc-4.3.0-1.5.aarch64.rpm"
RPM_HASH = "c6e90e74abb715132f039be361677befd9f6999fa78620da5b99db1804bd64bcfd0e0347e788da1e25a2a430683da881c03f3c41b4f6fd1d5d52ac8bb10a725d"

RPROVIDES:${PN} += "form-doc"

RDEPENDS:${PN} += ""

inherit rpm
