SUMMARY = "File-finding iterator"
DESCRIPTION = "File-finding iterator"
LICENSE = "Artistic-2.0"

PV = "1.18"

RPM_NAME = "perl-File-Next-1.18-1.15.aarch64.rpm"
RPM_HASH = "4141aa9ef4807cb51028a01456dde5765317b5c1c6cea422759702d6724ec4d2523dfe14d95a631eed88a6e2f37321fee935bbb4f6962bae5fab4c34dd306129"

RPROVIDES:${PN} += "perl-File--Next \
perl-File-Next"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-File--Temp \
perl-Test--More"

inherit rpm
