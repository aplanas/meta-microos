SUMMARY = "Documentation for tup"
DESCRIPTION = "Documents and examples for tup"
LICENSE = "GPL-2.0-only"

PV = "0.7.11"

RPM_NAME = "tup-doc-0.7.11-1.11.noarch.rpm"
RPM_HASH = "45381dd2a0cfaa9f12eaa93f1436a2a7b75d3024131879453a1c863cce4cc6f259d79fdb4b3dc7b3186700bb9169021a8d0058492a27e26299bc2defb8357387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tup-doc"

RDEPENDS:${PN} += "tup"

inherit rpm
