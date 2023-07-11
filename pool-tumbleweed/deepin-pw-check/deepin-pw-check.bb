SUMMARY = "Deepin Password Check tool"
DESCRIPTION = "deepin-pw-check is a tool to verify the validity of the password"
LICENSE = "GPL-3.0+"

PV = "5.1.16"

RPM_NAME = "deepin-pw-check-5.1.16-1.6.aarch64.rpm"
RPM_HASH = "f807cb6f76171a540245a316a3132ab4768622a4b0e64bebcc40d6e07cef0b68651dfba9332e99b6d88552157625f642b555513711222d93a12829f396db3a4a"

RPROVIDES:${PN} += "deepin-pw-check"

RDEPENDS:${PN} += ""

inherit rpm
