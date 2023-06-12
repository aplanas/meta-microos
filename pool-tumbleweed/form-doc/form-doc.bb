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

RPM_NAME = "form-doc-4.3.0-1.3.aarch64.rpm"
RPM_HASH = "414bff06972e11ca8c7e3f2f29d5630f7448ce255e1d656b247fea70b752e4787d875504fd3fc7bf79bb48b10b809e16ffb0114a926b1909ef51c7d454e0f23b"

RPROVIDES:${PN} += "form-doc \
form-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
