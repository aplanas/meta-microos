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

RPM_NAME = "cross-hppa-gcc12-bootstrap-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "b6d404f5854d71529abdf6446e0dfa97df5d385c7c430c35f57dcbc39813a784edc6b920ba1e86003e43d2fed1e6d5195717e91cc8dc46fb2f63755b042b6919"

RPROVIDES:${PN} += "cross-hppa-gcc12-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
update-alternatives"

inherit rpm
