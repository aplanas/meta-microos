SUMMARY = "Configuration for the Raspberry Pi firmware loader"
DESCRIPTION = "This package configures the Raspberry Pi boot process. \
2 flavors are available: \
  * raspberrypi-firmware-config - the default config \
  * raspberrypi-firmware-config-camera - the config which enables \
  start_x=1 and increase gpu_mem to be able to use a camera module \
 \
Note: config.txt should not be used to set manually params (gpu_mem, etc.) \
please create extraconfig.txt instead."
LICENSE = "MIT"

PV = "2023.04.25"

RPM_NAME = "raspberrypi-firmware-config-camera-2023.04.25-2.1.noarch.rpm"
RPM_HASH = "03a79ff2ef807ba637e23e09bc143527d8906ea2fd90280894c401da882279d350ddd87b6380f208fb501f7bfe8f224ab245e087a1132e08212c075f1ccbc2b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-raspberrypi-firmware-config-camera \
raspberrypi-firmware-branding-openSUSE \
raspberrypi-firmware-config \
raspberrypi-firmware-config-camera \
raspberrypi-firmware-config-rpi \
raspberrypi-firmware-config-rpi0w \
raspberrypi-firmware-config-rpi2 \
raspberrypi-firmware-config-rpi3"

RDEPENDS:${PN} += "/usr/bin/sh \
raspberrypi-firmware"

inherit rpm
