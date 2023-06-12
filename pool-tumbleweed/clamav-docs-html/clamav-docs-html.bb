SUMMARY = "Documentation for ClamAV in HTML format"
DESCRIPTION = "Optional HTML documentation for ClamAV antivirus engine"
LICENSE = "GPL-2.0-only"

PV = "0.103.8"

RPM_NAME = "clamav-docs-html-0.103.8-1.3.noarch.rpm"
RPM_HASH = "0486532f53fb4f8b73f241fdb38f79ece253c71d8fbcce366ee47d728132293f3bed29ab88b4a7ad01926c3d1ee7d4939bfe3673a604afce0716ac24d4b85dbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clamav-docs-html"
RDEPENDS:${PN} += "clamav"

inherit rpm
