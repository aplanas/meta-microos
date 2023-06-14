SUMMARY = "Utility to display current system parameters"
DESCRIPTION = "With procmeter, one can display various system parameters, e.g. \
processor load, network load, etc."
LICENSE = "GPL-2.0-or-later"

PV = "3.6+svn415"

RPM_NAME = "procmeter-3.6+svn415-1.9.aarch64.rpm"
RPM_HASH = "57bfa489515dd9c7d58408037d12c712039795725fdfc185530980958b2c7c7546eb89fd173e8c0ad85dec11e50b3bc4bb6e54bf7ff20796fe59f696d5620313"

RPROVIDES:${PN} += "libsensors-fan.so \
libsensors-temp.so \
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
