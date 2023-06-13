SUMMARY = "Development files for stlink package"
DESCRIPTION = "STLINK v1/v2 JTAG/SWD debugging/flashing tool for STM32 microcontrollers."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "stlink-devel-1.7.0-2.7.aarch64.rpm"
RPM_HASH = "80250b3c919ed3a98d72563cc7920c59e29094d368df93e9341473dff52c10dc264e78d49cc1e8bdcfda973dc765738611e4469d29d291a56776711aa77dcdea"

RPROVIDES:${PN} += "stlink-devel \
stlink-devel(aarch-64)"

RDEPENDS:${PN} += "libstlink1"

inherit rpm
