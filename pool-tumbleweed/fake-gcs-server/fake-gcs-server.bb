SUMMARY = "Google Cloud Storage emulator & testing library"
DESCRIPTION = "fake-gcs-server provides an emulator for Google Cloud Storage API. It can be used as a library in Go projects and/or as a standalone binary/Docker image."
LICENSE = "BSD-2-Clause"

PV = "1.45.2"

RPM_NAME = "fake-gcs-server-1.45.2-2.1.aarch64.rpm"
RPM_HASH = "cf9a05ef695640946862d265ef0067fc579aabd3b4976246a2e45bfaf3d6140e64509df4aa5914e0d68d98b7eac33f537c561338d4f68d7fb1f3cc720c7b4216"

RPROVIDES:${PN} += "fake-gcs-server"

RDEPENDS:${PN} += ""

inherit rpm
