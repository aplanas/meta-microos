SUMMARY = "Development files for the LinuxPPS API"
DESCRIPTION = "This subpackage contains a header-only C API providing a number of \
inline C functions that call out to the kernel's Pulse Per Second \
API. It is, for example, used by ntpd to interact with timing \
devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.0+git.20211122"

RPM_NAME = "pps-tools-devel-0.0.0+git.20211122-1.3.aarch64.rpm"
RPM_HASH = "62b05b4724f411297059758b090fea63fa7bc7335b979af377af921551a3b46cab7effb0f905f642c8841dcedd9af3bad5d83d60f6685ac735f41d2cbfc89f16"

RPROVIDES:${PN} += "pps-tools-devel"

RDEPENDS:${PN} += ""

inherit rpm
