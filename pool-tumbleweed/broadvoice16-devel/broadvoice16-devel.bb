SUMMARY = "BroadVoice 16 development files"
DESCRIPTION = "Header files for the libbv16 library."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "broadvoice16-devel-1.2-3.7.aarch64.rpm"
RPM_HASH = "503f1216a8a9ee649065aaff6e50f0e9cb94237a2a802fbf28759a5fbc4c51b9d93baec84ff9396d410516dc8fc491d573f4c28563e7b97fd2cf397a22f2c006"

RPROVIDES:${PN} += "broadvoice16-devel \
broadvoice16-devel(aarch-64)"

RDEPENDS:${PN} += "broadvoice16"

inherit rpm
