SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "5.9.5"

RPM_NAME = "python310-psutil-5.9.5-2.1.aarch64.rpm"
RPM_HASH = "9c739c4463360550fc0357c01b8a5531d65be94817fc9e5ff5453b593dd21c39b964cacd807fd7c66faff111f197d2c0436274338de20217405ee05247d59470"

RPROVIDES:${PN} += "python3.10dist-psutil \
python310-psutil \
python3dist-psutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
procps \
python-abi"

inherit rpm
