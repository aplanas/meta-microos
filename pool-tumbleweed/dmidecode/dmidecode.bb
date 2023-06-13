SUMMARY = "DMI table decoder"
DESCRIPTION = "Dmidecode reports information about your system's hardware as described \
in your system BIOS according to the SMBIOS/DMI standard. This \
information typically includes system manufacturer, model name, serial \
number, BIOS version, asset tag as well as a lot of other details of \
varying level of interest and reliability depending on the \
manufacturer. This will often include usage status for the CPU sockets, \
expansion slots (e.g. AGP, PCI, ISA) and memory module slots, and the \
list of I/O ports (e.g. serial, parallel, USB). \
 \
Beware that DMI data have proven to be too unreliable to be blindly \
trusted. Dmidecode does not scan your hardware, it only reports what \
the BIOS told it to."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "dmidecode-3.5-3.1.aarch64.rpm"
RPM_HASH = "db12a36742f0d5faa876bf4f825a62158bcf1aa97a4e88cf1c44a4447fc48ade4634a2583456c944982862e578f6339c8b255d235aa772c1bca1f1915c4e7e1d"

RPROVIDES:${PN} += "dmidecode \
dmidecode(aarch-64) \
pmtools:/usr/sbin/dmidecode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
