SUMMARY = "Build tested documentation"
DESCRIPTION = "This package contains documentation files for python311-manuel."
LICENSE = "Apache-2.0"

PV = "1.12.4"

RPM_NAME = "python311-manuel-doc-1.12.4-4.1.noarch.rpm"
RPM_HASH = "c5a085ebe4fb5f628a3e0e260e94b8c7a8572f4a57e0bc49062dc81471c0255021b0d401a2a51c13f6f0a584cb33529105cef0fd275f244b8198dc1e50f5308c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-manuel-doc"
RDEPENDS:${PN} += ""

inherit rpm
