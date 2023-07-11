SUMMARY = "Support library required by Pocketsphinx"
DESCRIPTION = "CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "5~git20220609.617e536"

RPM_NAME = "sphinxbase5-5~git20220609.617e536-1.5.aarch64.rpm"
RPM_HASH = "735910a5f91c976fd42bc5221e383621fdb30c6c8d430e2568325f2d06fc9c0b1dd90f52975eede5d8560a9c682cffe70cc7cdd03cafa296faac1873b4e3bf72"

RPROVIDES:${PN} += "sphinxbase5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsphinxad.so.3 \
libsphinxbase.so.3 \
update-alternatives"

inherit rpm
