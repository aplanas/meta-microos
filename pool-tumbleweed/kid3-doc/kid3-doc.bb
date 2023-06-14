SUMMARY = "Documentation for kid3"
DESCRIPTION = "This package provides documentation and help files for kid3."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-doc-3.9.3-1.3.aarch64.rpm"
RPM_HASH = "44097f8f6f1f6c12c70cfbfc5d8bd9a9d7403308ba6545ee56f421c364e10db1f133d32eba21be9ee3b4b2f113d26052f880ef4ea53466be17f72e147a276ae1"

RPROVIDES:${PN} += "kid3-doc"

RDEPENDS:${PN} += "kid3"

inherit rpm
