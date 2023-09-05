SUMMARY = "Documentations for the postfix package"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program. \
This package contains the documentation for postfix"
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-doc-3.8.1-2.1.noarch.rpm"
RPM_HASH = "de6505c2370a7d8b9b676114c9b4a33536f37cee750a493ad9a875a53b163bbb71126305d1413ffa10e8941645fc9c4ead1e7757cbceeab56ecd1bf12c3e07a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postfix-doc"

RDEPENDS:${PN} += ""

inherit rpm
