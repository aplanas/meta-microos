SUMMARY = "Documentation for qt6-httpserver in QCH format"
DESCRIPTION = "This package contains documentation for qt6-httpserver in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-httpserver-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d063b37ee41637170de6e6c4b79803635a4a629a0d81aa14c8f7649000addb0628ef325dc00bf9394af5b9fd785d1dcaa2f3ffa27027ad3d5ce681aeb7dc955c"

RPROVIDES:${PN} += "qt6-httpserver-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
