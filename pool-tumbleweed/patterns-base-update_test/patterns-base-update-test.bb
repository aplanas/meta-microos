SUMMARY = "Tests for the Update Stack"
DESCRIPTION = "Packages used for testing that the update stack works.  These tiny packages do not have any functionality themselves."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-update_test-20200505-42.1.aarch64.rpm"
RPM_HASH = "24252fb42d1440dc1e922f51efe2f303bb3da40f49e5a9647a6dbc3d102c11e2d89c32ac18a5a31c5f36c5b21f6467d4cb3725d94bcbf95662603388155214dc"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-update-test \
patterns-openSUSE-update-test"

RDEPENDS:${PN} += "update-test-affects-package-manager \
update-test-interactive \
update-test-optional \
update-test-reboot-needed \
update-test-security \
update-test-trivial"

inherit rpm
