SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-pru-gcc12-bootstrap-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "cf889ed869fb13f09bb93bba7272a183cdca16cb394ac9376f56299ea7bef313e649097113a46f44e1b12ca451347272c29439c0f9721b11cb2a5b817f7cf33e"

RPROVIDES:${PN} += "cross-pru-gcc12-bootstrap \
cross-pru-gcc12-bootstrap(aarch-64) \
pru-gcc"
RDEPENDS:${PN} += "/bin/sh \
cross-pru-binutils \
update-alternatives"

inherit rpm
