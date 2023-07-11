SUMMARY = "Test update that should be marked as retracted"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should mark the update as retracted \
in zypper."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-retracted-5.1-1.18.aarch64.rpm"
RPM_HASH = "6f669fa4c67e3d157ad329d934dc4aeea1b163bef9bc0ea8df03e9d468dc0aba7c2be495a7300df75cb0be6ccb2447ed1ff29178fee89b92257b93f53f814c77"

RPROVIDES:${PN} += "update-test-retracted"

RDEPENDS:${PN} += ""

inherit rpm
