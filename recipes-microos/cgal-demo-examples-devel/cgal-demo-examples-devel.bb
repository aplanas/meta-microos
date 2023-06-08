SUMMARY = "Example & demo files for CGAL library usage"
DESCRIPTION = "This package provides the sources of examples and demos of \
CGAL algorithms. You can study them, compile and test CGAL \
library."
LICENSE = "BSL-1.0 & GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "5.5.2"

RPM_NAME = "cgal-demo-examples-devel-5.5.2-2.1.noarch.rpm"
RPM_HASH = "8b023ffb76328456024da551e1f473caf99ed9239a24925396eb281f62a9a4bbf85fd937a9edde12a8d7d94b8c51b8d59ee6edc1f901f1e4456212ead9078c02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cgal-demo-examples-devel"
RDEPENDS:${PN} += "/bin/sh cgal-devel"

inherit rpm
