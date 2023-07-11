SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "5.9.5"

RPM_NAME = "python310-psutil-5.9.5-1.3.aarch64.rpm"
RPM_HASH = "0915296e184ac902ee328ad273d40e09b1072e4c2c470a98aa48bf2e7c371794639863992eb1e85f9411eafe32e47a9ea94f67a44956816f00206f028f9e22a3"

RPROVIDES:${PN} += "python3.10dist-psutil \
python310-psutil \
python3dist-psutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
procps \
python-abi"

inherit rpm
