SUMMARY = "Python bindings for iptables"
DESCRIPTION = "Python-iptables is a Python project that provides bindings to the iptables C libraries in Linux. \
Interoperability with iptables is achieved using the iptables C libraries (libiptc, libxtables, \
and iptables extensions), not calling the iptables executable and parsing its output as most other \
iptables wrapper libraries do; this makes python-iptables faster and not prone to parsing errors, \
at the same time leveraging all available iptables match and target extensions without further work."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "python311-iptables-0.13.0-1.23.aarch64.rpm"
RPM_HASH = "481217782a98dd27c5a42ba5fa2dd8b0c89c939c14d860f92d72e4d38c68124083750fc046367733052ad584cce780525effa2dade6e38000f0848361da0e126"

RPROVIDES:${PN} += "libxtwrapper.cpython-311-aarch64-linux-gnu.so()(64bit) \
python3.11dist(python-iptables) \
python311-iptables \
python311-iptables(aarch-64) \
python3dist(python-iptables)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
