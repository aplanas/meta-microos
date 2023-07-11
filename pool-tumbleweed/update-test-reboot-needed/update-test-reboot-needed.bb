SUMMARY = "Test update that requires a system reboot"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should inform the user that a system \
reboot is necessary. This is used, for example, in kernel updates."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-reboot-needed-5.1-1.18.aarch64.rpm"
RPM_HASH = "0c44cfe7643113c4457245c620fae2bd49d4a01f569fd723acb66c88e5fed1f80ca81b3cd4cde28482504759213788b95a30f41aeaf2e0b990818a742e38c78f"

RPROVIDES:${PN} += "update-test-reboot-needed"

RDEPENDS:${PN} += ""

inherit rpm
