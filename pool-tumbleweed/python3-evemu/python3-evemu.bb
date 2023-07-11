SUMMARY = "Python3 bindings for evemu"
DESCRIPTION = "The evemu library and tools are used to describe devices, record \
data, create emulation devices and replay data from kernel evdev \
(input event) devices. \
 \
This package provides the Python3 bindings for evemu."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "python3-evemu-2.7.0-3.13.aarch64.rpm"
RPM_HASH = "b9ad484b081eb71eef214cff26919e7296337b26f4e1e78771e185158472de9d3e16cf89c3545a449cbdba5f5573bd8d8d0ca3edd9fff3c720712611df2443ee"

RPROVIDES:${PN} += "python3-evemu"

RDEPENDS:${PN} += "libevemu3 \
python-abi"

inherit rpm
