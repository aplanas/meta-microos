SUMMARY = "Documentation how to use mate-applets"
DESCRIPTION = "This package contains the documentation for mate-applets"
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-applets-doc-1.26.1-1.4.noarch.rpm"
RPM_HASH = "48f34cd675396084d7ef6bd21a9e40d3860b004f5f8910dec5967eba08b9409b312be8947ef1e040c3bc77892da2975ca5c77b806a97ef50694bfb15c5bde5a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-applets-doc"

RDEPENDS:${PN} += ""

inherit rpm
