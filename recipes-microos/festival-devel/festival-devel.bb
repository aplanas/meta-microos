SUMMARY = "Development Package for Festival"
DESCRIPTION = "Files needed for developing software that uses Festival."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "festival-devel-2.5.0-8.9.aarch64.rpm"
RPM_HASH = "60457954720b3579c14f8943c4c06f1a8ebe9dde6d00158dd3ae08f309b1076abb26baf1b6c796d0f860e9ace38511fa5752104e946f056e7b37f56f4605d79f"

RPROVIDES:${PN} += "festival-devel festival-devel(aarch-64)"
RDEPENDS:${PN} += "festival"

inherit rpm
