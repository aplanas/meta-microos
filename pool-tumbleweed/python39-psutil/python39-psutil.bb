SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "5.9.5"

RPM_NAME = "python39-psutil-5.9.5-3.1.aarch64.rpm"
RPM_HASH = "b7c6394c934c5afcc6876f1a8538c475258569349a540521244f32485868acdf99236808ea7a7cedae4b1fbb2a2bb91bc344fd10112c25f486491ad2bf39d0d1"

RPROVIDES:${PN} += "python3.9dist-psutil \
python39-psutil \
python3dist-psutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
procps \
python-abi"

inherit rpm
