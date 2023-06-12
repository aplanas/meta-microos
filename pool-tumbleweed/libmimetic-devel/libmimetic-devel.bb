SUMMARY = "Development files for mimetic"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use mimetic."
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "libmimetic-devel-0.9.8-3.8.aarch64.rpm"
RPM_HASH = "44b630d068cc1b0c1c4670dc7b6d8d09977db34d507903ca22fe9dca04b6d43bd47c56899ea01de5c0a74a2f59618dd5cfdaa87a9c196623af7352d825d9712b"

RPROVIDES:${PN} += "libmimetic-devel \
libmimetic-devel(aarch-64)"
RDEPENDS:${PN} += "libmimetic0"

inherit rpm
