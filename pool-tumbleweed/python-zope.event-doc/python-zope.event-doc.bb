SUMMARY = "Very basic event publishing system"
DESCRIPTION = "This package contains documentation files for python-zope.event."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python-zope.event-doc-5.0-1.1.noarch.rpm"
RPM_HASH = "3363a32d30b7f46d1ce231b65e7310cdba30f0cfd921051f38d71f6ae174f22835f56a5313fb5f3b68e614a8358fdf408278b1dbbf31cc4fe1168048aa857cff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.event-doc"

RDEPENDS:${PN} += ""

inherit rpm
