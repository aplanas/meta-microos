SUMMARY = "Development headers for the postfix package"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-devel-3.8.0-2.2.noarch.rpm"
RPM_HASH = "05fff7ef858cf1eeacf38d17658a01c3e8e5299277f0341d8408d12768235978936b68aa9e6775fd15af367e027d16ec175c06845d5a6d0283ba397d58072cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postfix-devel"

RDEPENDS:${PN} += "postfix"

inherit rpm
