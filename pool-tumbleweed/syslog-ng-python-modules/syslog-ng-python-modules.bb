SUMMARY = "Python modules for syslog-ng"
DESCRIPTION = "This package provides python modules for syslog-ng, for \
Kubernetes log enrichment, Hypr support, etc."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-python-modules-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "700c61279b19064f8a08093b04fc92cb359fa036c644ff68d22c3765c53dfbb470ce72a708469eeb96c0c65b7a5c27f6bdc0f4d36a90fcd123f6f5c4e22b46ed"

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
