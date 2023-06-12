SUMMARY = "Cross-platform library for games and multimedia programming"
DESCRIPTION = "Allegro is a cross-platform library intended for use in computer games \
and other types of multimedia programming. \
 \
A wide range of extension packages and add-on modules are also available, which \
can be found in the 'Library Extensions' section of the Allegro website."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "allegro44-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "bc46b3df3eae08150e345eae0f2ac07be901fd206f0d4c71b090e93d9b656be65cf6981e9e2e6710bdf0dd463ef6347017aebad187006637190f6af97926076a"

RPROVIDES:${PN} += "allegro44 \
allegro44(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
liballeg.so.4.4()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
