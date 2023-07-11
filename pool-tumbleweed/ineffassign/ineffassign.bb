SUMMARY = "Tool to detect ineffectual assignments in Go code"
DESCRIPTION = "This tool misses some cases because does not consider any type information in \
its analysis. (For example, assignments to struct fields are never marked as \
ineffectual.) It should, however, never give any false positives."
LICENSE = "MIT"

PV = "0.0.0+git20210225.2e10b26"

RPM_NAME = "ineffassign-0.0.0+git20210225.2e10b26-1.13.aarch64.rpm"
RPM_HASH = "34de2d4f46248dc51f1d0a6f33fc6fdd4765f86b24750d090536ed481776f82f02301b72c291534f381310637b61892460a78fcab989e7e64333be4b8ae1bf18"

RPROVIDES:${PN} += "ineffassign"

RDEPENDS:${PN} += ""

inherit rpm
