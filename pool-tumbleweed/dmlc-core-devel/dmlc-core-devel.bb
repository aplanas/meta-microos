SUMMARY = "Devel files for dmlc-core"
DESCRIPTION = "DMLC-Core is the backbone library to support all DMLC projects, offers the bricks to build efficient and scalable distributed machine learning libraries."
LICENSE = "Apache-2.0"

PV = "0.5"

RPM_NAME = "dmlc-core-devel-0.5-1.8.aarch64.rpm"
RPM_HASH = "dfb28e61a6ebdd1ea6f50d31a39c8ded056adc5c0e92e281e513d1d8a885e493e8dde6a91eea8c2f49542d5a6f173e027ad49decf95e7087e43d7985d403a828"

RPROVIDES:${PN} += "cmake-dmlc \
dmlc-core-devel"

RDEPENDS:${PN} += "libdmlc"

inherit rpm
