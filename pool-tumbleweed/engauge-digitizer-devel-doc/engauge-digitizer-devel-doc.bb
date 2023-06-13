SUMMARY = "Development documentation for Engauge Digitizer"
DESCRIPTION = "This package contains the development documentation for Engauge Digitizer."
LICENSE = "GPL-2.0-or-later"

PV = "12.1"

RPM_NAME = "engauge-digitizer-devel-doc-12.1-2.4.noarch.rpm"
RPM_HASH = "7242365777efa233671d247b2e41a76b5fcd8a3812c8493510d7effa0b8cc00b5cabffacaa910c2c27e98e110fb09871b3774b11fda611d4feed5b36ece159aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "engauge-digitizer-devel-doc"

RDEPENDS:${PN} += "engauge-digitizer"

inherit rpm
