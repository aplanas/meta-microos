SUMMARY = "Deepin Password Check tool"
DESCRIPTION = "deepin-pw-check is a tool to verify the validity of the password"
LICENSE = "GPL-3.0+"

PV = "5.1.16"

RPM_NAME = "deepin-pw-check-5.1.16-1.5.aarch64.rpm"
RPM_HASH = "57b7093ddc292309318f446a3887e7a73252a55f3ea779e0632430272c1bcb6942a64610bd1096d8c5a18ddc72e07206efe9bcdd54ed5bf809034d24c1dbdab4"

RPROVIDES:${PN} += "deepin-pw-check \
deepin-pw-check(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
