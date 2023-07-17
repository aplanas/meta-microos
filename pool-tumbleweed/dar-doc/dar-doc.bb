SUMMARY = "Documentation for dar"
DESCRIPTION = "Documentation package for dar"
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.7.10"

RPM_NAME = "dar-doc-2.7.10-1.1.aarch64.rpm"
RPM_HASH = "06f2d3c27327af96f64f30a2c71a14add8b4602a7f90864656ed19d3bac0565eb23a76a84c733591e79002b606502294ec6d94486a0213f030df0df25bc5375f"

RPROVIDES:${PN} += "dar-doc"

RDEPENDS:${PN} += ""

inherit rpm
