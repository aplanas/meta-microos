SUMMARY = "LV2 port of the Airwindows plugins"
DESCRIPTION = " \
This is an LV2 port (by Hannes Braun) of the Airwindows plugins \
originally developed by Chris Johnson. \
 \
Right now, only 95 plugins (out of 350) have been ported to LV2."
LICENSE = "MIT"

PV = "20.0"

RPM_NAME = "lv2-airwindows-20.0-1.1.aarch64.rpm"
RPM_HASH = "debcd602b318b765643d22d35482cc87f2c52c151b53c3e680753d5e905f0e59892cc716389cd658bfb68cf8b8aa728347c5488b281338440d941b65f776a50d"

RPROVIDES:${PN} += "lv2-airwindows"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
