SUMMARY = "Manual for apache-commons-httpclient"
DESCRIPTION = "Manual for apache-commons-httpclient \
 \
Manual for apache-commons-httpclient."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "apache-commons-httpclient-manual-3.1-13.11.noarch.rpm"
RPM_HASH = "3f89d3be331aeefb4bc413f4fa2c60b3a1a4e9e48db6f709d3fce3aa8815d7a84d096e01c83526bc896981a060d5225d822e2f6bb4451fa9109cff64e80a3b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-httpclient-manual"
RDEPENDS:${PN} += ""

inherit rpm
