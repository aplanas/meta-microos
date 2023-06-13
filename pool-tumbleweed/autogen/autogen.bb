SUMMARY = "Automated Text File Generator"
DESCRIPTION = "AutoGen is a tool designed for generating program files that contain \
repetitive text with varied substitutions.  Its goal is to simplify the \
maintenance of programs that contain large amounts of repetitious text. \
This is especially valuable if there are several blocks of such text that \
must be kept synchronized in parallel tables."
LICENSE = "GPL-3.0-or-later"

PV = "5.18.16"

RPM_NAME = "autogen-5.18.16-7.6.aarch64.rpm"
RPM_HASH = "1839778cb816895a9c6ca12fba6023b6b5448dc8f3cd54c56b0b7894fe814fd7aae9513a5fe3290c5ab0b2f7ab0e08a5d03c31659d16948cdfb454c8a68ca3a3"

RPROVIDES:${PN} += "autogen \
autogen(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libguile-3.0.so.1()(64bit) \
libopts.so.25()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
