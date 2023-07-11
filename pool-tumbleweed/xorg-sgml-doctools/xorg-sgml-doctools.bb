SUMMARY = "Set of SGML entities and XML/CSS style sheets for building X.org documentation"
DESCRIPTION = "This package provides a common set of SGML entities and XML/CSS style \
sheets used in building/formatting the documentation provided in other \
X.Org packages."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "xorg-sgml-doctools-1.12-1.6.noarch.rpm"
RPM_HASH = "25e1a57b0859019a52ded74788592b81d89eb116fce9dfe008025f4ff396032852a37c41f7ce91c79a6aaacfec2e92b4dd797cac8e20d6877c47376430cdcc40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-xorg-sgml-doctools \
xorg-sgml-doctools"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
