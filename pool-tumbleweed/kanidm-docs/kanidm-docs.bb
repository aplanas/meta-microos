SUMMARY = "Documentation for Kanidm Administration"
DESCRIPTION = "Documentation for using and configuring Kanidm."
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha12~git0.bcdbb18"

RPM_NAME = "kanidm-docs-1.1.0~alpha12~git0.bcdbb18-1.2.aarch64.rpm"
RPM_HASH = "c49bb8cb0ea24a832a3a9ffd59b8410d6d12c5f2d82cfcc3c400e0ef7e70951540b8c9a0214b64c35d11e9049baea7c2e76f10eb3db8bf7020939cffed85b1a4"

RPROVIDES:${PN} += "kanidm-docs"

RDEPENDS:${PN} += ""

inherit rpm
