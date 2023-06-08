SUMMARY = "Development files for using ade"
DESCRIPTION = "A graph construction, manipulation, and processing framework. It is suitable \
for organizing data flow processing and execution."
LICENSE = "Apache-2.0"

PV = "0.1.2a"

RPM_NAME = "ade-devel-0.1.2a-1.3.aarch64.rpm"
RPM_HASH = "f5d346cce7c46e84b4f0a263e04ecba56c824e9027e2ea0b3a448c930947012f5a897be6b8af820bc30f1bede67a0e92cf73b97369905a578ddd9be92dee6447"

RPROVIDES:${PN} += "ade-devel ade-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
