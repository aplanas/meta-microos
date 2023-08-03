SUMMARY = "Examples for qbs"
DESCRIPTION = "This package contains examples to show different qbs usages."
LICENSE = "LGPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "qbs-examples-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "938f81aec5f380993f01430bce71baa0a5f2a3273c97b7f40e50e03e6e637fd03d8689ae8f6fbed6b7599c52de5caeff6c7049cd555d150cdd8e808d9531512a"

RPROVIDES:${PN} += "qbs-examples"

RDEPENDS:${PN} += "qbs"

inherit rpm
