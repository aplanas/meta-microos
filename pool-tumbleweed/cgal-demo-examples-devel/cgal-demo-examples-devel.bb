SUMMARY = "Example & demo files for CGAL library usage"
DESCRIPTION = "This package provides the sources of examples and demos of \
CGAL algorithms. You can study them, compile and test CGAL \
library."
LICENSE = "BSL-1.0 & GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "5.6"

RPM_NAME = "cgal-demo-examples-devel-5.6-1.1.noarch.rpm"
RPM_HASH = "be23446d01371bf3867c898e4a49133f0d97ae2e69b3471327be3c8f41284b658da4624028abe8260c8ee98646ec40f84ef71632054ce2973bb802b175615158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cgal-demo-examples-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
cgal-devel"

inherit rpm
