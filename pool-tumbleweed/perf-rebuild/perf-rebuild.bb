SUMMARY = "Empty package to ensure rebuilding perf in OBS"
DESCRIPTION = "This is an empty package that ensures perf is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "perf-rebuild-6.4.3-80.10.aarch64.rpm"
RPM_HASH = "a32caca65eda963b579f7236245de2856b80c465ce875ad04e9703d4d1ade1b05e7dbc4e9b87891cb620a5f0b5a64b069aef21448cada508a2a97aa8e9a8bb40"

RPROVIDES:${PN} += "perf-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
