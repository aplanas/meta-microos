SUMMARY = "SGML and XML DTDs for the W3C Markup Validator"
DESCRIPTION = "SGML and XML DTDs for the W3C Markup Validator."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "w3c-markup-validator-libs-1.3-10.16.noarch.rpm"
RPM_HASH = "c2a802e3546a67181513c2562c7d8aa89323cff8ad68b4418e5b20f6eb67185730c3212af0530fb308e3daabe3fb315805c4d580cfd9e1aa07910e9120030242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-w3c-markup-validator-libs \
w3c-markup-validator-libs"

RDEPENDS:${PN} += "/usr/bin/sh \
sgml-skel"

inherit rpm
