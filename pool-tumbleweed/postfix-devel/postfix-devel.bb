SUMMARY = "Development headers for the postfix package"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-devel-3.8.1-1.1.noarch.rpm"
RPM_HASH = "d6bbe5b3dd9fe9141b0affe080af78fa65aefdd3506accb402b8d3fa5d0cb068737fabc7d8d78f8c4af227794b52ecab881ae71053df91e77163f2f20bd88f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postfix-devel"

RDEPENDS:${PN} += "postfix"

inherit rpm
