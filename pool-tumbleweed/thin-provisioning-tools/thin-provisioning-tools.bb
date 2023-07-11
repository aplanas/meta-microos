SUMMARY = "Thin Provisioning Tools"
DESCRIPTION = "A suite of tools for thin provisioning on Linux."
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "thin-provisioning-tools-0.9.0-2.10.aarch64.rpm"
RPM_HASH = "1c1c3c342c51c976ce0e2fde9b87fc87f24595f959734e8c3b101cb57592761f511c091988d3415ac3732d83835cab8233a57625ef529ee7d3ea68732fdb0678"

RPROVIDES:${PN} += "thin-provisioning-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
