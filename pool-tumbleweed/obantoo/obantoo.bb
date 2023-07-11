SUMMARY = "German Online Banking Library"
DESCRIPTION = "A library of tools for German online banking implementing SEPA, IBAN/BIC, DETAUS and QIF."
LICENSE = "LGPL-3.0-only"

PV = "2.1.12"

RPM_NAME = "obantoo-2.1.12-4.7.noarch.rpm"
RPM_HASH = "f70eebb990c80c96ed6b41d616f6a6eb36e6cca4d24c335c4a125f1c8a22c35ba29e34972c9e606948149866d12c11872b5dbcb7346e38efcad9a3fced321bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obantoo"

RDEPENDS:${PN} += ""

inherit rpm
