SUMMARY = "Utility to display current system parameters"
DESCRIPTION = "With procmeter, one can display various system parameters, e.g. \
processor load, network load, etc."
LICENSE = "GPL-2.0-or-later"

PV = "3.6+svn415"

RPM_NAME = "procmeter-3.6+svn415-1.9.aarch64.rpm"
RPM_HASH = "57bfa489515dd9c7d58408037d12c712039795725fdfc185530980958b2c7c7546eb89fd173e8c0ad85dec11e50b3bc4bb6e54bf7ff20796fe59f696d5620313"

RPROVIDES:${PN} += "application() \
application(procmeter3.desktop) \
libsensors-fan.so()(64bit) \
libsensors-temp.so()(64bit) \
procmeter \
procmeter(aarch-64) \
procmtr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libsensors.so.4()(64bit)"

inherit rpm
