SUMMARY = "Command-line ACPI client"
DESCRIPTION = "Linux ACPI client is a small command-line program that attempts to \
replicate the functionality of the 'old' apm command on ACPI systems. \
It includes battery and thermal information."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "acpi-1.7-5.9.aarch64.rpm"
RPM_HASH = "e11628d8077fe7712ce0ea41e8d9719360957022ffd4288196a0254a1dc7d5a32a448514cfda130f13ad6e7ea5f7f17353c37014fa0098e212c0f381d4b35c43"

RPROVIDES:${PN} += "acpi acpi(aarch-64) acpid:/usr/bin/acpi"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
