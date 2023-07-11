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

RPM_NAME = "python310-python-prctl-1.8.1-2.6.aarch64.rpm"
RPM_HASH = "6ee095130a218e9c246cce962fa85fc8d93941b9a594b7f9a39af7545f72ebc3bf223a899fdd061d8eda42936927c0c9f58d41b64ba3380415468c93f3e76ffb"

RPROVIDES:${PN} += "python3.10dist-python-prctl \
python310-python-prctl \
python3dist-python-prctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
python-abi"

inherit rpm
