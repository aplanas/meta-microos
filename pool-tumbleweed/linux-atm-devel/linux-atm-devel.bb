SUMMARY = "Development for ATM"
DESCRIPTION = "Libraries and header files for ATM (Asynchronous Transfer Mode) \
networking."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.2"

RPM_NAME = "linux-atm-devel-2.5.2-8.8.aarch64.rpm"
RPM_HASH = "f6a221cd24dc54752c87e90aa672b552a875f3ca205acdefebf7f93a6a53f0001898ca2a4903c69dc06c782946300562895610f899d2effcdcf637c61ec0fd7d"

RPROVIDES:${PN} += "linux-atm-devel \
linux-atm-devel(aarch-64)"

RDEPENDS:${PN} += "libatm1"

inherit rpm
