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

RPM_NAME = "python39-python-prctl-1.8.1-2.6.aarch64.rpm"
RPM_HASH = "7d9c94578689735a6281b90df40debc998e169f06cdd7421e0346877f099322fe1a336d62d70869e16d709e8ecd4f118a4209ee73c4313887a434f6efabe43ac"

RPROVIDES:${PN} += "python3.9dist-python-prctl \
python39-python-prctl \
python3dist-python-prctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
python-abi"

inherit rpm
