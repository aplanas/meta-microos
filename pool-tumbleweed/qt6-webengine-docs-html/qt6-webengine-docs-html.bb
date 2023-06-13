SUMMARY = "Documentation for qt6-webengine in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webengine in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-webengine-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8ead2a5a74515a7e2a8cbb9c4880dab208db04d3b65c912cbe63f38762116c93bf6623b685de4590fb58e4aeecd02a75aa7ab30f176f971f44edc53269fb904a"

RPROVIDES:${PN} += "qt6-webengine-docs-html \
qt6-webengine-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
