SUMMARY = "Python bindings for iptables"
DESCRIPTION = "Python-iptables is a Python project that provides bindings to the iptables C libraries in Linux. \
Interoperability with iptables is achieved using the iptables C libraries (libiptc, libxtables, \
and iptables extensions), not calling the iptables executable and parsing its output as most other \
iptables wrapper libraries do; this makes python-iptables faster and not prone to parsing errors, \
at the same time leveraging all available iptables match and target extensions without further work."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "python311-iptables-0.13.0-1.25.aarch64.rpm"
RPM_HASH = "248011d70385f0560c6d7f91df6eb44efc13f1ad99163943c707c71056c2b03898004ac287fbbff1085f5f2c8b2b1ca89c5e8175bb1cfbe47f03e425138bad7c"

RPROVIDES:${PN} += "libxtwrapper.cpython-311-aarch64-linux-gnu.so \
python3-iptables \
python3.11dist-python-iptables \
python311-iptables \
python3dist-python-iptables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
