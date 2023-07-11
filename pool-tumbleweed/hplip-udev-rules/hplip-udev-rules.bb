SUMMARY = "HPLIP udev rules"
DESCRIPTION = "This package provides the udev rules required to use these devices as a normal user."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.22.10"

RPM_NAME = "hplip-udev-rules-3.22.10-2.3.aarch64.rpm"
RPM_HASH = "29c34eae18ac7b00ceffb32b572155ad839f5882dbe6bff85f7599d24e36678ff87f7456f4ba3df3532c2929b746ae5765e93ed295d7069ceb234372f42cc72c"

RPROVIDES:${PN} += "hplip-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
