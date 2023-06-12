SUMMARY = "Userspace daemon for using joy-cons with the hid-nintendo kernel driver"
DESCRIPTION = "joycond is a Linux daemon which uses evdev devices provided by \
hid-nintendo (formerly known as hid-joycon) to implement joycond \
pairing."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.0+git.51~f9a6691"

RPM_NAME = "joycond-0.1.0+git.51~f9a6691-3.6.aarch64.rpm"
RPM_HASH = "a5806a76c54a6c771d88bb19e35ad224a0deb3fad3c25167c695248a7155c42fc27ba6d6178d46683d2357c6d71d5a42bf960d5fb55e34b9625fe831fc5b185f"

RPROVIDES:${PN} += "joycond \
joycond(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
kmod(hid_nintendo.ko) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
