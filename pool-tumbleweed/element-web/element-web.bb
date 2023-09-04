SUMMARY = "A glossy Matrix collaboration client - web files"
DESCRIPTION = "A glossy Matrix collaboration client - web files"
LICENSE = "Apache-2.0"

PV = "1.11.38"

RPM_NAME = "element-web-1.11.38-1.1.noarch.rpm"
RPM_HASH = "9d2cd46ee6d93d024c53d352a02cc3546e7590be187de34e2b86a88a322ded497afd396968f0714524b0f8293f0c45579e364c07e4cdf22490893bafe7b0fd07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-element-web \
element-web"

RDEPENDS:${PN} += ""

inherit rpm
