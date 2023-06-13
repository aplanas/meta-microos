SUMMARY = "Utility library for cmpi development"
DESCRIPTION = "A set of utility functions that make cmpi provider development easier"
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "sblim-cmpiutil-devel-1.0.1-24.25.aarch64.rpm"
RPM_HASH = "91e43571dd3effe23a1ab964126fea3f7c456f0517e757cdede04840bb74bef595d25cd27649da4afaeb17cb6e40aa5418a227f1034d4ab457e2484a17bcd6eb"

RPROVIDES:${PN} += "sblim-cmpiutil-devel \
sblim-cmpiutil-devel(aarch-64)"

RDEPENDS:${PN} += "libsblim-cmpiutil1"

inherit rpm
