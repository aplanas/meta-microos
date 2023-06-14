SUMMARY = "Test update that requires a software stack restart"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should be installed first by the \
update stack and then ask the user to run the update process \
again to apply other updates that might be available. This is \
used, for example, to update packages from the software update \
stack (zypper, libzypp, packagekit, etc)."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-affects-package-manager-5.1-1.17.aarch64.rpm"
RPM_HASH = "1b5c2fc6bc3f3335dcc5304a1e0569acb422e79b286f353bf8d8bc7ed92a181c1f3b2720b7b035b8a8add2c3c3b96582719f85c2ea2abff132ffabe43e48fc7a"

RPROVIDES:${PN} += "update-test-affects-package-manager"

RDEPENDS:${PN} += ""

inherit rpm
