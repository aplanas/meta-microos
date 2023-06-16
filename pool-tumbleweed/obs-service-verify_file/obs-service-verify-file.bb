SUMMARY = "An OBS source service: file verification"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It allows to verify a file with a given sha256sum"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "obs-service-verify_file-0.1.1-3.2.noarch.rpm"
RPM_HASH = "cc7351b4ca62752ad71c4811d12a9207cd78ce57c6e6cdb2a1ea1e8d47ce44e34deadece3b142a7b58751ebad7c27444eff9744b2d58503f49c832c4203631ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-verify-file"

RDEPENDS:${PN} += "/usr/bin/bash \
coreutils"

inherit rpm
