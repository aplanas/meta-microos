SUMMARY = "Python bindings for iptables"
DESCRIPTION = "Python-iptables is a Python project that provides bindings to the iptables C libraries in Linux. \
Interoperability with iptables is achieved using the iptables C libraries (libiptc, libxtables, \
and iptables extensions), not calling the iptables executable and parsing its output as most other \
iptables wrapper libraries do; this makes python-iptables faster and not prone to parsing errors, \
at the same time leveraging all available iptables match and target extensions without further work."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "python310-iptables-0.13.0-1.25.aarch64.rpm"
RPM_HASH = "266bef64875b53f29360c5af0c8a2b2c7aa4f14a731831d090579de9678429bd2624ce3b8e8417188d1c68d2a760f19374f76ebce2f5b67241add5effcc6aa66"

RPROVIDES:${PN} += "libxtwrapper.cpython-310-aarch64-linux-gnu.so \
python3.10dist-python-iptables \
python310-iptables \
python3dist-python-iptables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
