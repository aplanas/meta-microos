SUMMARY = "Python modules for syslog-ng"
DESCRIPTION = "This package provides python modules for syslog-ng, for \
Kubernetes log enrichment, Hypr support, etc."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-python-modules-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "8d257a34564f1859c545b7ab2facfa118e8a7baca7a16fc0def4b0299324421a35755665fb90f233b8110496d8eabd04dbade6b9a07c134a9a4efb8837099307"

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
