SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-hppa-gcc12-bootstrap-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "a5c555e4f275c240750b5d6e087ccafabece3664b5dea4ea972e77221ffe112b378774f1aeee65d216fa0a2d6981889a0a95a50758e9eb99c077451a855757e3"

RPROVIDES:${PN} += "cross-hppa-gcc12-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
update-alternatives"

inherit rpm
