SUMMARY = "Documentation for ClamAV in HTML format"
DESCRIPTION = "Optional HTML documentation for ClamAV antivirus engine"
LICENSE = "GPL-2.0-only"

PV = "0.103.8"

RPM_NAME = "clamav-docs-html-0.103.8-1.4.noarch.rpm"
RPM_HASH = "84aaae4e0c757fc51b5ca2700724c2dbeda0dcbc5834f10579e01beee7293d4c0ee4b58115c8f921ad077bd2a8b229893c10974089359bbcfe4d0f345e7bc40e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clamav-docs-html"

RDEPENDS:${PN} += "clamav"

inherit rpm
