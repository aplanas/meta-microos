SUMMARY = "Openmpt's libmodplug"
DESCRIPTION = "The ModPlug mod file playing library (emulated via libopenmpt)."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.0"

RPM_NAME = "libopenmpt_modplug1-0.8.9.0-1.12.aarch64.rpm"
RPM_HASH = "7ddf722fc4846c074cd03ba95fdf6417f10e47e9f9fdc79aa5691e60e13ad182648493da45454e89c4598be5d5db8dee37349d30f8c6190656d9ca11e4b51ec4"

RPROVIDES:${PN} += "libopenmpt-modplug.so.1 \
libopenmpt-modplug1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenmpt.so.0 \
libstdc++.so.6"

inherit rpm
