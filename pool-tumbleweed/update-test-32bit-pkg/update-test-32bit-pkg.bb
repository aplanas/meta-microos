SUMMARY = "Test update that contains a 32bit package"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should contain a 32bit-package."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-32bit-pkg-5.1-1.18.aarch64.rpm"
RPM_HASH = "5a050ca8e0934e498a84c2313ee302c4ee4de891f2a4fbb4018df204898c2615fee01a9a0af7b3ffa231300757b1dd6459f25935cb1d20e1ed0645edcd0d8c3a"

RPROVIDES:${PN} += "update-test-32bit-pkg"

RDEPENDS:${PN} += ""

inherit rpm
