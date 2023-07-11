SUMMARY = "BroadVoice 32 development files"
DESCRIPTION = "Header files for the libbv32 library."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "broadvoice32-devel-1.2-2.8.aarch64.rpm"
RPM_HASH = "378350474a4c3f0d361271e35824edbf105203d70233d653e6e3e23d91809b95d80bf226c438c04e749650628266621ebcca11663105975aa08c0599a1a63f17"

RPROVIDES:${PN} += "broadvoice32-devel"

RDEPENDS:${PN} += "broadvoice32"

inherit rpm
