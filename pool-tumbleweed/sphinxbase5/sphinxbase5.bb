SUMMARY = "Support library required by Pocketsphinx"
DESCRIPTION = "CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "5~git20220609.617e536"

RPM_NAME = "sphinxbase5-5~git20220609.617e536-1.4.aarch64.rpm"
RPM_HASH = "ded6ce571397e74868c4a58e8f2eca0943a110d6e930a56f367d9f39baff1162d0a3783397798a2ac18f6812c6fb7e4bdc176ad5cbaf45c1dc3ff87408e74f70"

RPROVIDES:${PN} += "sphinxbase5 \
sphinxbase5(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libsphinxad.so.3()(64bit) \
libsphinxbase.so.3()(64bit) \
update-alternatives"

inherit rpm
