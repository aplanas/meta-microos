SUMMARY = "A clipboard manager for Wayland"
DESCRIPTION = "A clipboard manager for Wayland with support for \
persisting copy buffers after an application exits."
LICENSE = "GPL-3.0-only"

PV = "1.6.1"

RPM_NAME = "clipman-1.6.1-1.8.aarch64.rpm"
RPM_HASH = "e1b9fd243b15def6e40b1ea76204183b24b34da556f0151e38f01db269dffa089ac89f6618f65c436e0c7457db750efdecccc6af4343962f4561cbddc24f9288"

RPROVIDES:${PN} += "clipman clipman(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
