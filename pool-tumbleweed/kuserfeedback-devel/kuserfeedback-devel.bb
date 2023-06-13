SUMMARY = "Development files for kuserfeedback"
DESCRIPTION = "Development files for kuserfeedback, a framework for collecting feedback from \
application users via telemetry and targeted surveys."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "kuserfeedback-devel-1.2.0-1.14.aarch64.rpm"
RPM_HASH = "686efd97a08c801375db4890e72f0bd2f73bd56b58ca61df48b4117e3feb232972488a19e9c13ea2e5b87e6ce2602b92ea474540e2f553068d8564ea24e1de0d"

RPROVIDES:${PN} += "cmake(KUserFeedback) \
kuserfeedback-devel \
kuserfeedback-devel(aarch-64)"

RDEPENDS:${PN} += "libKUserFeedbackCore1 \
libKUserFeedbackWidgets1"

inherit rpm
