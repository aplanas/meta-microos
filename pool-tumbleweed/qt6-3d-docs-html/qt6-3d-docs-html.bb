SUMMARY = "Documentation for qt6-3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-3d-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "91316c69ac237d7c19bb400781d50ceaa64cc5d84cff517d48f351cdbd8bea59f4df150305778d7be417297a8b687abc17938f2263b445b73552890abf5fee71"

RPROVIDES:${PN} += "qt6-3d-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
