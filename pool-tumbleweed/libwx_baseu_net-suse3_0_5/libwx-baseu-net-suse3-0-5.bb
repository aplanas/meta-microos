SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu_net-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "80a9161864c89d627cf3119cc90fbd33eb8cf0fb0e9422f66498cde44129ae19428687ca276cd38cb16a7e2352bbccbe469af607fb7acbb76db313d37c7ea843"

RPROVIDES:${PN} += "libwx_baseu_net-suse.so.3.0.5()(64bit) \
libwx_baseu_net-suse3_0_5 \
libwx_baseu_net-suse3_0_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.3.0.5()(64bit)"

inherit rpm
