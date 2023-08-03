SUMMARY = "Documentation for texlive-ticket"
DESCRIPTION = "This package includes the documentation for texlive-ticket"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4dsvn42280"

RPM_NAME = "texlive-ticket-doc-2023.209.0.0.4dsvn42280-55.1.noarch.rpm"
RPM_HASH = "d41fed1474eb474d903da0d145e02af38179e53426b2b3808720da6ec60c9078c1216a1a65e8d990231edc93ab983b60fc520622c3b1d9ee97921732532ad601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ticket-doc"

RDEPENDS:${PN} += ""

inherit rpm
