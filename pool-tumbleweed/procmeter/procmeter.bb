SUMMARY = "Utility to display current system parameters"
DESCRIPTION = "With procmeter, one can display various system parameters, e.g. \
processor load, network load, etc."
LICENSE = "GPL-2.0-or-later"

PV = "3.6+svn415"

RPM_NAME = "procmeter-3.6+svn415-1.10.aarch64.rpm"
RPM_HASH = "dd04127680e69260395d91e209badfbb43a28adde30b4c2e8118dd6510cc4991863b20a58e8b41ed4fb799b9b66c2a80bf514f95fe4e3e1e0a5d41a3d86e6364"

RPROVIDES:${PN} += "libsensors-fan.so \
libsensors-temp.so \
libsensors-volt.so \
procmeter \
procmtr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsensors.so.4"

inherit rpm
