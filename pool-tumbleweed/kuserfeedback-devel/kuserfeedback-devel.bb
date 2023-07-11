SUMMARY = "Development files for kuserfeedback"
DESCRIPTION = "Development files for kuserfeedback, a framework for collecting feedback from \
application users via telemetry and targeted surveys."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "kuserfeedback-devel-1.2.0-1.15.aarch64.rpm"
RPM_HASH = "546b75fcdee1227b7b6a16cf41f29f0b3561ae5595863dcaf2c7d00274e6bb9f8e065e2e88ee246c3931b767098c7082545b36a250d02995b0503ab1d47b64a4"

RPROVIDES:${PN} += "cmake-KUserFeedback \
kuserfeedback-devel"

RDEPENDS:${PN} += "libKUserFeedbackCore1 \
libKUserFeedbackWidgets1"

inherit rpm
