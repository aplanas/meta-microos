SUMMARY = "Manual for apache-commons-httpclient"
DESCRIPTION = "Manual for apache-commons-httpclient \
 \
Manual for apache-commons-httpclient."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "apache-commons-httpclient-manual-3.1-13.12.noarch.rpm"
RPM_HASH = "6477845c107d84115c3eacf5ed04254fccf1a43dd6b019ece7d6be0b4b436e8bbb83c6002967722e926a67594f6c7e9672ed4d6712b0d2f846c3a367ae10eb73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-httpclient-manual"

RDEPENDS:${PN} += ""

inherit rpm
