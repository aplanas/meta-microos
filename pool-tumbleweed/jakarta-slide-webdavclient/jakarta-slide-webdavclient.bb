SUMMARY = "Slide WebDAV client"
DESCRIPTION = "Slide includes a fully featured WebDAV client library and command line \
client."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "jakarta-slide-webdavclient-2.1-27.10.noarch.rpm"
RPM_HASH = "78c45489cdc03270c80090202e6fa24f82d5d2aaa2e3f6156ed5dd916a722187dcfb3f436d91b9179533e25e5955e465b29453e8b81e83231c1e95c91c86a8be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-slide-webdavclient"

RDEPENDS:${PN} += "/usr/bin/sh \
geronimo-j2ee-connector-1-5-api \
jakarta-commons-httpclient3 \
jakarta-commons-transaction \
jdom \
xml-im-exporter"

inherit rpm
