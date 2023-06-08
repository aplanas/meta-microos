SUMMARY = "Google Cloud Storage emulator & testing library"
DESCRIPTION = "fake-gcs-server provides an emulator for Google Cloud Storage API. It can be used as a library in Go projects and/or as a standalone binary/Docker image."
LICENSE = "BSD-2-Clause"

PV = "1.32.2"

RPM_NAME = "fake-gcs-server-1.32.2-1.8.aarch64.rpm"
RPM_HASH = "ef31d3695f2ed4adb10617b35c0ad8127130d85142f4739381f49fc691ba786c71fc42436072ad94b40d44848b54bf6ba902de16c9de72eb91352b7a4c66a53b"

RPROVIDES:${PN} += "fake-gcs-server fake-gcs-server(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
