SUMMARY = "Plymouth 'script' plugin"
DESCRIPTION = "This package contains the 'script' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-script-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "9801ab0f18db9d1df5953dca1f99c11250ba0cef8632422ee2f1a16007b9050a35ba4d9a87aad84cc0ca10562e2a7eee29864f60568199a70e0eddff5aa94e3f"

RPROVIDES:${PN} += "plymouth-plugin-script \
plymouth-plugin-script(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libply-splash-core.so.5()(64bit) \
libply-splash-core5 \
libply-splash-graphics.so.5()(64bit) \
libply-splash-graphics5 \
libply.so.5()(64bit) \
libply5"

inherit rpm
