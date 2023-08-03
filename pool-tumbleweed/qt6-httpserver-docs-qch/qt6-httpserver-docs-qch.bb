SUMMARY = "Documentation for qt6-httpserver in QCH format"
DESCRIPTION = "This package contains documentation for qt6-httpserver in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-httpserver-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0cae6c335f931f137648342131e5b27c380aa48fb09cd9b78580e03beed2dbf9d73ef53df58206fcaebc8ea1bcf0d727dffd4989b3821e0482b593b3bf273871"

RPROVIDES:${PN} += "qt6-httpserver-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
