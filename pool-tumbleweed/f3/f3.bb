SUMMARY = "Fight Flash Fraud / Fight Fake Flash"
DESCRIPTION = "This package contains tools for identifying fake flash drives (primarily USB \
sticks and memory cards). \
 \
A fake flash drive fraudulently inflates its apparent storage capacity (far) \
beyond the physical capacity of its flash memory. Not surprisingly, using such \
a flash drive will, sooner or later, result in data loss and/or corruption. \
 \
The main tools in this package are an open-source implementation of the H2testw \
algorithm. Some extra tools are also provided, among them one for using \
the actual storage capacity of fake drives as safely as possible."
LICENSE = "GPL-3.0-only"

PV = "8.0"

RPM_NAME = "f3-8.0-1.12.aarch64.rpm"
RPM_HASH = "f9074ff79d23efa80145df3df7bd2a8b7f48e37d249bc3e22903688ae82bcd188386de5470c12dda2c59900cb05d2f5c24e255d2cecac001447c7aa81dcad396"

RPROVIDES:${PN} += "f3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libparted.so.2 \
libudev.so.1"

inherit rpm
