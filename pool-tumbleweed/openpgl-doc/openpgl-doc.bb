SUMMARY = "Documentation files for the Open Path Guiding library"
DESCRIPTION = "Documentation files for the Open Path Guiding library."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "openpgl-doc-0.4.1-1.3.noarch.rpm"
RPM_HASH = "b936753acc14d64c344dcf7e45980ebbe18cfe9e32fcb6df2323c890fbc73fcc8332ae43c344f4166112e4ad06c1a6af1366db4fa981416678d4433e88abff41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openpgl-doc"

RDEPENDS:${PN} += ""

inherit rpm
