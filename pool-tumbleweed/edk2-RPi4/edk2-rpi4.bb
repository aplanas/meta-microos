SUMMARY = "Firmware required to run the RPi4"
DESCRIPTION = "Firmware required to run the RPi4"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-RPi4-0.0~20230118T162833~201514e6-2.1.aarch64.rpm"
RPM_HASH = "aba58c48f61572a3d803012f31ecb5959fc1bb8eb65e61d55ab3acbcb7579f0e03685dc00b3e4ea31946fac8c660b4dd37cb5964e53b0bcb66840d840d692aea"

RPROVIDES:${PN} += "edk2-RPi4 \
edk2-RPi4(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
