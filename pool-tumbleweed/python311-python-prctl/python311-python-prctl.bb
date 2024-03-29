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

RPM_NAME = "python311-python-prctl-1.8.1-2.6.aarch64.rpm"
RPM_HASH = "520680d009401e5d4c04f8df5af12ebdaf1b9fbe77e4e896b867682bcbd5474c0b62fa37bae1ccf044151a9e430f253bb9a6398a7c9c58e4f30c20973223813b"

RPROVIDES:${PN} += "python3-python-prctl \
python3.11dist-python-prctl \
python311-python-prctl \
python3dist-python-prctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
python-abi"

inherit rpm
