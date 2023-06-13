SUMMARY = "Python bindings for MINUIT2"
DESCRIPTION = "iminuit is a Python interface to the MINUIT2 C++ package. \
 \
It can be used as a general function minimization method, \
but is most commonly used for likelihood fits of models to data, \
and to get model parameter error estimates from likelihood profile analysis."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "python310-iminuit-2.18.0-1.1.aarch64.rpm"
RPM_HASH = "1334369c4a3e5fe62ab0b716fd90a25a2d741ad34688cdca127a56d151ae224c75db07bb9a0287d98f8553a08b225a3da05580b82671e22fcbcd7d375d907217"

RPROVIDES:${PN} += "python3-iminuit \
python3.10dist(iminuit) \
python310-iminuit \
python310-iminuit(aarch-64) \
python3dist(iminuit)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-numpy"

inherit rpm
