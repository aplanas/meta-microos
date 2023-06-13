SUMMARY = "Python(ic) interface to the linux prctl syscall"
DESCRIPTION = "The linux prctl function allows you to control specific characteristics of a \
process' behaviour. Usage of the function is fairly messy though, due to \
limitations in C and linux. This module provides a nice non-messy python(ic) \
interface. \
 \
Besides prctl, this library also wraps libcap for complete capability handling \
and allows you to set the process name as seen in ps and top."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.1"

RPM_NAME = "python311-python-prctl-1.8.1-2.4.aarch64.rpm"
RPM_HASH = "ca043ef936eda2c7e8cc638dab5b51b060de694997d9b1aefcf7b1b38d6d90a0bdc25ae0ab505a3db5eaf18115e968365daf0843859f12061d0715475f59f445"

RPROVIDES:${PN} += "python3.11dist(python-prctl) \
python311-python-prctl \
python311-python-prctl(aarch-64) \
python3dist(python-prctl)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcap.so.2()(64bit) \
python(abi)"

inherit rpm
