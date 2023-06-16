SUMMARY = "Slide WebDAV client"
DESCRIPTION = "Slide includes a fully featured WebDAV client library and command line \
client."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "jakarta-slide-webdavclient-2.1-27.9.noarch.rpm"
RPM_HASH = "3024cfa0930ada080c067674de078195abf4af45bba27c12bb8c7c39ed65ac0f9ad7cdbe982c0fd8574ed911242d1b3d4955b4fefb66e951fd028ba1a5a0649a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-slide-webdavclient"

RDEPENDS:${PN} += "/usr/bin/sh \
geronimo-j2ee-connector-1-5-api \
jakarta-commons-httpclient3 \
jakarta-commons-transaction \
jdom \
xml-im-exporter"

inherit rpm
