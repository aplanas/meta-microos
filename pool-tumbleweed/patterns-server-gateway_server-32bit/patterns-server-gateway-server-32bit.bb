SUMMARY = "Internet Gateway"
DESCRIPTION = "The 32bit pattern complementing gateway_server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-gateway_server-32bit-20210330-5.1.aarch64.rpm"
RPM_HASH = "9f673af4fd21765143d89454e4655be4c22c6a2245083e099cea5b54569f4dbc00f33d85b66c76c95c09d7b4814867debb5892f95fb82807136026cb3b169262"

RPROVIDES:${PN} += "pattern- \
patterns-server-gateway-server-32bit"

RDEPENDS:${PN} += ""

inherit rpm
