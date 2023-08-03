SUMMARY = "Python modules for syslog-ng"
DESCRIPTION = "This package provides python modules for syslog-ng, for \
Kubernetes log enrichment, Hypr support, etc."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-python-modules-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "77d01cac5acd85679208ec13fa8adbb42409a6b05ffcf7824f36bc5059a46aaa0f7f7687e9095306ebef11dfd04880e8b9cb9bd3e385844c3f210bf40141597e"

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
