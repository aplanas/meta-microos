SUMMARY = "Random Saying"
DESCRIPTION = "Fortune displays a random text string from a set of files in a certain \
format. \
 \
This occurs each time you start a login shell. To get this feature just \
uncomment the respective lines in the user's .profile."
LICENSE = "BSD-4-Clause"

PV = "2.10.0"

RPM_NAME = "fortune-2.10.0-1.16.aarch64.rpm"
RPM_HASH = "86486d939e013ea0a3b0a039d7c8eb35879d592ff9a59d2ffa4a51827a51c9186f9fc18961fba4312797f95a1f317d001e2845334c3835f638439e5c818adad4"

RPROVIDES:${PN} += "fortune fortune(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) librecode.so.3()(64bit)"

inherit rpm
