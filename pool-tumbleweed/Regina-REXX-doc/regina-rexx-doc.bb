SUMMARY = "Documentation for the Regina REXX interpreter"
DESCRIPTION = "Documentation for both the Regina REXX interpreter and the REXX Utility \
Functions (regutil)."
LICENSE = "GFDL-1.1-only & LGPL-2.1-or-later"

PV = "3.9.1"

RPM_NAME = "Regina-REXX-doc-3.9.1-6.9.aarch64.rpm"
RPM_HASH = "aab3b295ab44b2023dbb33dfe1533c9dd927fb39c17dfe67a67935291905d142275ac88dc7cd4ef76b9f6719f40f50beabbed0bdb2a29df14e1cf9049c17883d"

RPROVIDES:${PN} += "Regina-REXX-doc \
Regina-REXX-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
