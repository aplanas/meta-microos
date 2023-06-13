SUMMARY = "Test Framework for Bourne Based Shell Scripts"
DESCRIPTION = "shUnit2 is a xUnit unit test framework for Bourne based shell scripts, \
and it is designed to work in a similar manner to JUnit, PyUnit, etc. \
If you have ever had the desire to write a unit test for a shell \
script, shUnit2 can do the job."
LICENSE = "LGPL-2.1"

PV = "2.1.6"

RPM_NAME = "shunit2-2.1.6-6.16.noarch.rpm"
RPM_HASH = "4fc4f413bdcf23a5ef62fc8b07be3e89e3e93c7eccf24a8f1f810adb794a06c12dae8a0e44f27330a87fdb69608b6f465b5645928fde75465d6bba8605bae933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shunit2"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
