SUMMARY = "Google Cloud Storage emulator & testing library"
DESCRIPTION = "fake-gcs-server provides an emulator for Google Cloud Storage API. It can be used as a library in Go projects and/or as a standalone binary/Docker image."
LICENSE = "BSD-2-Clause"

PV = "1.45.2"

RPM_NAME = "fake-gcs-server-1.45.2-1.1.aarch64.rpm"
RPM_HASH = "83ffedce8cf0ac06468beafbb4a9e6ffea1a3d163ce8f29a39385bac7ed88edae7a607c6718007459599f6f4c96d472c97d39216a48e793e866b39106d0e308b"

RPROVIDES:${PN} += "fake-gcs-server"

RDEPENDS:${PN} += ""

inherit rpm
