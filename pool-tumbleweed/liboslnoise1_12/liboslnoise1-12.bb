SUMMARY = "OpenShadingLanguage's image noise generation library"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "liboslnoise1_12-1.12.10.0-2.1.aarch64.rpm"
RPM_HASH = "a71e39c3d9a355e4f2acc348cb2478915ff3cc280f408d18199ff1e9d832ed8aa9203a5ba16f42a078d3ea92b704d16a3c2416be8b4f1d4ad8f592f97a34f9db"

RPROVIDES:${PN} += "liboslnoise.so.1.12 \
liboslnoise1-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
