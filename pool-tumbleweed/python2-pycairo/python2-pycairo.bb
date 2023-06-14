SUMMARY = "Python Bindings for Cairo"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.18.1"

RPM_NAME = "python2-pycairo-1.18.1-5.14.aarch64.rpm"
RPM_HASH = "0b6878451240892af02feb2d601f376e4767b6d3cfd90873d32c87ce2ffa3391c92a42aafc4d1b34504fa9fca1f58c4bb73b232be7399c804a0f8c35df631080"

RPROVIDES:${PN} += "python-cairo \
python2-cairo \
python2-pycairo \
python2.7dist-pycairo \
python2dist-pycairo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libpython2.7.so.1.0 \
python-abi"

inherit rpm
