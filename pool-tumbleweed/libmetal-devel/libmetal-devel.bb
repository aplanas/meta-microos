SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "BSD-3-Clause"

PV = "2020.10.0"

RPM_NAME = "libmetal-devel-2020.10.0-1.3.aarch64.rpm"
RPM_HASH = "c395fe77a3312f2686820352b12c9de7e9104f0831ee5e7ea9fcf7b9cd5b53ab73d0a4429727f7bef8768ccc8c160b74f67809552678b4c71f875c164bc2fc9b"

RPROVIDES:${PN} += "libmetal-devel"

RDEPENDS:${PN} += "libmetal0"

inherit rpm
