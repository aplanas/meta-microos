SUMMARY = "Utility to display current system parameters"
DESCRIPTION = "With procmeter, one can display various system parameters, e.g. \
processor load, network load, etc."
LICENSE = "GPL-2.0-or-later"

PV = "3.6+svn415"

RPM_NAME = "procmeter-3.6+svn415-2.1.aarch64.rpm"
RPM_HASH = "2521044dc8982a78be7aa507530c74bb0b81f00eb8903426dcd57721879616e73b299ae5d13635a9a02b991006c8a37291e6c54145e6101549107d8a82fe190f"

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
