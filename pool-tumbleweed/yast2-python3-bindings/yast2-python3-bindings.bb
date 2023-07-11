SUMMARY = "Python3 bindings for the YaST platform"
DESCRIPTION = "The bindings allow YaST modules to be written using the Python language \
and also Python scripts can use YaST agents, APIs and modules."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-python3-bindings-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "246f02127a76e04bf8bf0d5f115198925ff3a8d67a76a3a187e00f7a2b4617e28cc6fd902b74298f02dd4376313ba650732ff83cfe3140bc9102a9e3907f2355"

RPROVIDES:${PN} += "libpy2lang-python3.so.0 \
yast2-python3-bindings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpy2wfm.so.2 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
python-abi \
python3 \
yast2-core \
yast2-ycp-ui-bindings"

inherit rpm
