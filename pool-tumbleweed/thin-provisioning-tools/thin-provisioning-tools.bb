SUMMARY = "Thin Provisioning Tools"
DESCRIPTION = "A suite of tools for thin provisioning on Linux."
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "thin-provisioning-tools-0.9.0-2.9.aarch64.rpm"
RPM_HASH = "d3ccc3b025fab25a843f02dc22f85885ad9372fa423ace884fb76caa0cecfc62754fd995e88cb991990a57c7c855bfdbefc4c4be1ae85618d086ebcb8767d2f3"

RPROVIDES:${PN} += "thin-provisioning-tools \
thin-provisioning-tools(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
libaio.so.1()(64bit) \
libc.so.6()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libncurses.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
