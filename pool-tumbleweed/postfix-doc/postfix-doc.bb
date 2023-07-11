SUMMARY = "Documentations for the postfix package"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program. \
This package contains the documentation for postfix"
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-doc-3.8.1-1.1.noarch.rpm"
RPM_HASH = "f2d754717d27273d9d48852aae4b8290033f78593157afd7975642c867222a7724549aff225683b675bb8596a0b3a67f9c1345b0b828e1c9a41112cb7e0e5043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postfix-doc"

RDEPENDS:${PN} += ""

inherit rpm
