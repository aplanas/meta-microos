SUMMARY = "OpenCensus threading Integration"
DESCRIPTION = "OpenCensus threading Integration"
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "python311-opencensus-ext-threading-0.1.2-2.11.noarch.rpm"
RPM_HASH = "301bb8b7f715268a5f0a9d2d14e4d44df21d45aafa9733f6e92ea159376395b545dcefa5966e06d2bad94a50d27b2827326e74a8ee63b64bd00c5a66dea1d311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opencensus-ext-threading \
python3.11dist-opencensus-ext-threading \
python311-opencensus-ext-threading \
python3dist-opencensus-ext-threading"

RDEPENDS:${PN} += "python-abi \
python311-opencensus"

inherit rpm
