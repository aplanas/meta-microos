SUMMARY = "Python bindings for iptables"
DESCRIPTION = "Python-iptables is a Python project that provides bindings to the iptables C libraries in Linux. \
Interoperability with iptables is achieved using the iptables C libraries (libiptc, libxtables, \
and iptables extensions), not calling the iptables executable and parsing its output as most other \
iptables wrapper libraries do; this makes python-iptables faster and not prone to parsing errors, \
at the same time leveraging all available iptables match and target extensions without further work."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "python39-iptables-0.13.0-1.23.aarch64.rpm"
RPM_HASH = "940f90a74131b2b0fcea3f33c2f4b7340ba260c5270c00ab4ec0db755b4e187097ad7474d3edc566c56e2be086bf1d930dde374fe12a710a297a58c2f807a8a5"

RPROVIDES:${PN} += "libxtwrapper.cpython-39-aarch64-linux-gnu.so()(64bit) \
python3.9dist(python-iptables) \
python39-iptables \
python39-iptables(aarch-64) \
python3dist(python-iptables)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
