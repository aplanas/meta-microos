SUMMARY = "Development files for stlink package"
DESCRIPTION = "STLINK v1/v2 JTAG/SWD debugging/flashing tool for STM32 microcontrollers."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "stlink-devel-1.7.0-2.8.aarch64.rpm"
RPM_HASH = "499023861c747b1a6b5b2eacd1e45fedd6d3a0302aac33a6ad1283e64e68f781a735c492d04e344170508dd3f3da705a2d40031fd0e7277295e8273f9f6d8681"

RPROVIDES:${PN} += "stlink-devel"

RDEPENDS:${PN} += "libstlink1"

inherit rpm
