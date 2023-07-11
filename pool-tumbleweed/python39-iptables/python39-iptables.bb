SUMMARY = "Python bindings for iptables"
DESCRIPTION = "Python-iptables is a Python project that provides bindings to the iptables C libraries in Linux. \
Interoperability with iptables is achieved using the iptables C libraries (libiptc, libxtables, \
and iptables extensions), not calling the iptables executable and parsing its output as most other \
iptables wrapper libraries do; this makes python-iptables faster and not prone to parsing errors, \
at the same time leveraging all available iptables match and target extensions without further work."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "python39-iptables-0.13.0-1.25.aarch64.rpm"
RPM_HASH = "1ca7a14f88be72d3f4cb046428f8cfb95e3430dbfe148b2823775d578c5173e52dc907e652aa2f784579a0ec9f8a51fadc4e38ef5f24adedd761aa645b50f603"

RPROVIDES:${PN} += "libxtwrapper.cpython-39-aarch64-linux-gnu.so \
python3.9dist-python-iptables \
python39-iptables \
python3dist-python-iptables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
