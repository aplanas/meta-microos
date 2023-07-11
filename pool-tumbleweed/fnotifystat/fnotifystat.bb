SUMMARY = "File activity monitoring tool"
DESCRIPTION = "Fnotifystat periodically dumps out the activity on files in the system. It can \
be used to identify rogue file activity and discover which processes are \
performing open/close/read/write operations on the files."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.06"

RPM_NAME = "fnotifystat-0.02.06-1.13.aarch64.rpm"
RPM_HASH = "9ae4ba06742ea634eefa09b464f0ca755fa96c17208de3270bcb8f33016176d2d5c2feb128b90300590570db51551fe9bd4d7636991beb9aee44b997ddee9c1f"

RPROVIDES:${PN} += "fnotifystat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
