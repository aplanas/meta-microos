SUMMARY = "Devel files for dmlc-core"
DESCRIPTION = "DMLC-Core is the backbone library to support all DMLC projects, offers the bricks to build efficient and scalable distributed machine learning libraries."
LICENSE = "Apache-2.0"

PV = "0.5"

RPM_NAME = "dmlc-core-devel-0.5-1.9.aarch64.rpm"
RPM_HASH = "c860ddb8f36e718385b4d5e4c70730c1f64b359f3a41782e33f1d02516a3409db0554d512e321103a397573993d45a731272aa319e3ccfea5ef34b57d03a9dd8"

RPROVIDES:${PN} += "cmake-dmlc \
dmlc-core-devel"

RDEPENDS:${PN} += "libdmlc"

inherit rpm
