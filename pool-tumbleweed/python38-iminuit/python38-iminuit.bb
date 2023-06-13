SUMMARY = "Python bindings for MINUIT2"
DESCRIPTION = "iminuit is a Python interface to the MINUIT2 C++ package. \
 \
It can be used as a general function minimization method, \
but is most commonly used for likelihood fits of models to data, \
and to get model parameter error estimates from likelihood profile analysis."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "python38-iminuit-2.18.0-1.1.aarch64.rpm"
RPM_HASH = "d7f5133d2eda7bf143ec968692a5db7dc8eacbc072ed973a76873cda35e8670312732fbf7b7f305d695a6d32503ea0e6e97ba955337cca68d71a3debe9012324"

RPROVIDES:${PN} += "python3.8dist(iminuit) \
python38-iminuit \
python38-iminuit(aarch-64) \
python3dist(iminuit)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python38-numpy"

inherit rpm
