SUMMARY = "A Wrapper to Securely Run Insecure or Untrusted Programs"
DESCRIPTION = "Compartment provides all possibilities (chroot, kernel capabilities) \
for securely running insecure or untrusted programs. It provides all \
necessary options to fine-tune the security tightening process as \
needed. \
 \
 \
 \
Authors: \
-------- \
    Marc Heuse <marc@suse.de>"
LICENSE = "GPL-2.0+"

PV = "1.1"

RPM_NAME = "compartm-1.1-457.25.aarch64.rpm"
RPM_HASH = "29106bfc0fc69eb9cf1ab23892297703e77e51d1e68b8674316caf8197bf6b4e0ede6d457afaa7c09bb416e151733e39e6c05021f47bf0eebaae187ffa4b082d"

RPROVIDES:${PN} += "compartm \
compartm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
