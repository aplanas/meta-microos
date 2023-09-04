SUMMARY = "Python modules for syslog-ng"
DESCRIPTION = "This package provides python modules for syslog-ng, for \
Kubernetes log enrichment, Hypr support, etc."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-python-modules-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "bfca63a6f0700ffafcf728db75e2f8f8758f9388cf70ddc1088978386ade9ec4d5a9503dd7aee971945304abf5dc8f4f5f5ec7fe97f022488d393d62080b9aef"

RPROVIDES:${PN} += "syslog-ng-python-modules"

RDEPENDS:${PN} += "python3-PyYAML \
python3-cachetools \
python3-certifi \
python3-charset-normalizer \
python3-google-auth \
python3-idna \
python3-kubernetes \
python3-pip \
python3-pyasn1 \
python3-pyasn1-modules \
python3-python-dateutil \
python3-requests \
python3-rsa \
python3-six \
python3-websocket-client \
syslog-ng \
syslog-ng-python"

inherit rpm
