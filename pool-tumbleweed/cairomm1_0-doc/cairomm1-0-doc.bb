SUMMARY = "Documentation for the Cairo C++ interface"
DESCRIPTION = "This package provides documentation for the Cairo C++ interface."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "cairomm1_0-doc-1.12.2-4.3.aarch64.rpm"
RPM_HASH = "ce3ac0d54bdec12ac65503f9be9491bb49079bb1d58b49599eaa925e881a6e74c67e44485abc0430e7f830ed4ca4abf8b61aa41d69a0dccb2222eb9abc90712e"

RPROVIDES:${PN} += "cairomm1_0-doc \
cairomm1_0-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
