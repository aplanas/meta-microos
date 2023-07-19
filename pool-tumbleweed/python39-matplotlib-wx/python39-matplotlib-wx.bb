SUMMARY = "WxWidgets backend for python39-matplotlib"
DESCRIPTION = "This package includes the wxWidgets-based wxagg backend \
for python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-wx-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "cb5257c9e0e045d6e0df6ede476b49774985c277e9db19af75a21f60df8a0980817c2a7ae9746d936f548421aa67e7ccfd29051ce0e243f2134c56318e2b2cff"

RPROVIDES:${PN} += "python39-matplotlib-wx"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-wxPython"

inherit rpm
