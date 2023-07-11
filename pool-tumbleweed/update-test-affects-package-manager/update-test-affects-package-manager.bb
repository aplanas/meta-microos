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

RPM_NAME = "update-test-affects-package-manager-5.1-1.18.aarch64.rpm"
RPM_HASH = "cbf1fae51b460748dd19a57f31082d39810d7bcf29fcc4356effc4bb3f84aca9b6a60d744e268123edcf5b221294625b7c8e16e409ffde2edcc3d7f011c9f9a2"

RPROVIDES:${PN} += "update-test-affects-package-manager"

RDEPENDS:${PN} += ""

inherit rpm
