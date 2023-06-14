SUMMARY = "Documentation for Icinga 2"
DESCRIPTION = "This subpackage provides documentation for Icinga 2."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "icinga2-doc-2.13.7-1.4.aarch64.rpm"
RPM_HASH = "26940916280642a62ff42c6db23809f374cab5773afa48f2dfcd700ff61339b8bc2fb998170b8c4e3bd171af329fd093f6ec2960964283bc29e88f4d99590530"

RPROVIDES:${PN} += "icinga2-doc"

RDEPENDS:${PN} += ""

inherit rpm
