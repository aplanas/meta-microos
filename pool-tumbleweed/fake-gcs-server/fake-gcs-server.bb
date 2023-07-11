SUMMARY = "Google Cloud Storage emulator & testing library"
DESCRIPTION = "fake-gcs-server provides an emulator for Google Cloud Storage API. It can be used as a library in Go projects and/or as a standalone binary/Docker image."
LICENSE = "BSD-2-Clause"

PV = "1.32.2"

RPM_NAME = "fake-gcs-server-1.32.2-1.10.aarch64.rpm"
RPM_HASH = "73ae63a931f8765663e3bbb2a34d1007978b6d431f0b452c7d85a30717fb9fa34cff217a9067fb14881a8639301491077d0f3beb2b2f0345dd441c0ff31f7ebc"

RPROVIDES:${PN} += "fake-gcs-server"

RDEPENDS:${PN} += ""

inherit rpm
