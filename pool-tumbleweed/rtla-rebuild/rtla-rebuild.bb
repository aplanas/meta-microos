SUMMARY = "Empty package to ensure rebuilding rtla in OBS"
DESCRIPTION = "This is an empty package that ensures rtla is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "rtla-rebuild-6.4.12-5.14.aarch64.rpm"
RPM_HASH = "f21de1f105db6ccfb3886d6e725c14cf7c0468f6ab982129868eaf25b20f5068e6633bdc8c6142a3aa66df777f3f87476f8af55ca1b1ce1d0496ef11347f2fc1"

RPROVIDES:${PN} += "rtla-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
