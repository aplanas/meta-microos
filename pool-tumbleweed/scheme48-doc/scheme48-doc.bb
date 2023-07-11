SUMMARY = "Documentation for Scheme48"
DESCRIPTION = "Documentation for Scheme48 VM and interpreter"
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "scheme48-doc-1.9.2-2.20.aarch64.rpm"
RPM_HASH = "6978046889ee4fab858a1180f3bb3deb82a29f1e99454145be445e8b89412bde899270b1f7808ae101060893e97197b10bc1b35b3894ffed9a3685fcd5127f45"

RPROVIDES:${PN} += "scheme48-doc"

RDEPENDS:${PN} += ""

inherit rpm
