SUMMARY = "OpenTracing API for Python"
DESCRIPTION = "OpenTracing API for Python. \
See documentation at http://opentracing.io"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python311-opentracing-2.4.0-4.2.noarch.rpm"
RPM_HASH = "e5ce573f9dda8dc3965fc623bc7fe770644ada9af94efe8f5c118f959e79787038e60eece4261809c834dbdd56f334c57036188510e47fe20ee9a9e65fec2268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-opentracing \
python311-opentracing \
python3dist-opentracing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
