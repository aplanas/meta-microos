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

RPM_NAME = "python310-python-prctl-1.8.1-2.4.aarch64.rpm"
RPM_HASH = "4614dce9e99b2dcf29823612220267d7db0fd84b9a1e54ddd3e55326cc05106c85f5d3eff48f2d32361d816bb7b0d5d485581c6996957ef2f3fa4a16a7fce9b3"

RPROVIDES:${PN} += "python3-python-prctl \
python3.10dist(python-prctl) \
python310-python-prctl \
python310-python-prctl(aarch-64) \
python3dist(python-prctl)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcap.so.2()(64bit) \
python(abi)"

inherit rpm