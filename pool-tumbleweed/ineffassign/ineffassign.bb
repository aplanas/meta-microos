SUMMARY = "Tool to detect ineffectual assignments in Go code"
DESCRIPTION = "This tool misses some cases because does not consider any type information in \
its analysis. (For example, assignments to struct fields are never marked as \
ineffectual.) It should, however, never give any false positives."
LICENSE = "MIT"

PV = "0.0.0+git20230610.0e73809"

RPM_NAME = "ineffassign-0.0.0+git20230610.0e73809-1.1.aarch64.rpm"
RPM_HASH = "3426c9dbd66765594ca83e62c5063dd27953537fc765aa6d9c99cfa8e3a7676d0f6fb78618130486ae09aa13fe22c1362bc873a9ae58efb1e228e6c800356389"

RPROVIDES:${PN} += "ineffassign"

RDEPENDS:${PN} += ""

inherit rpm
