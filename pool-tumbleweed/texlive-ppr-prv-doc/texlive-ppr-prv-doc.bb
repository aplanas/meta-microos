SUMMARY = "Documentation for texlive-ppr-prv"
DESCRIPTION = "This package includes the documentation for texlive-ppr-prv"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13csvn15878"

RPM_NAME = "texlive-ppr-prv-doc-2023.209.0.0.13csvn15878-53.1.noarch.rpm"
RPM_HASH = "73549a23f44ed82232978702ec094d52e63084abe345e0bf34bc2e9d7eab7b735b70d1cd2c4f678c12589c09989ff2f80303244dad9150cff6e1e60afade010d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ppr-prv-doc"

RDEPENDS:${PN} += ""

inherit rpm
