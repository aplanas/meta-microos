SUMMARY = "Google Cloud Storage emulator & testing library"
DESCRIPTION = "fake-gcs-server provides an emulator for Google Cloud Storage API. It can be used as a library in Go projects and/or as a standalone binary/Docker image."
LICENSE = "BSD-2-Clause"

PV = "1.32.2"

RPM_NAME = "fake-gcs-server-1.32.2-1.9.aarch64.rpm"
RPM_HASH = "d2aa5979d20825dadf89fd7385ec6b862474a4039e1180e282ec8f67534d532d3cbf26116ec08386a302965e53bfda6be15a7087e2f1b1a3f96c2d75b7e1f145"

RPROVIDES:${PN} += "fake-gcs-server"

RDEPENDS:${PN} += ""

inherit rpm
