SUMMARY = "Very basic event publishing system"
DESCRIPTION = "This package contains documentation files for python-zope.event."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python-zope.event-doc-4.6-5.1.noarch.rpm"
RPM_HASH = "6e4e42b0b8c9c8248f952c99dab7077bc601e644fb210283656cb9f259c78235420aec7233d936970b5c5ea375799de3addad45efd69d556589c558920ffe0a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.event-doc"

RDEPENDS:${PN} += ""

inherit rpm
