SUMMARY = "Google Cloud Guest Agent"
DESCRIPTION = "Google Cloud Guest Agent"
LICENSE = "Apache-2.0"

PV = "20230601.00"

RPM_NAME = "google-guest-agent-20230601.00-2.1.aarch64.rpm"
RPM_HASH = "a8a3f86a228f4384a7913378ea974a0f5742d7a35d2814c0a459a9c6d8c0e5e9eb7be0901e537e0a6978e76a90a11ab977eb85f7cf7196ba1b43c57063ef14ef"

RPROVIDES:${PN} += "google-compute-engine-init \
google-guest-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
google-guest-configs"

inherit rpm
