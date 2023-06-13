SUMMARY = "PAM module which allows executing a script"
DESCRIPTION = "This module will allow you to execute scripts during authorization, \
password changes and sessions. This is very handy if your current \
security application has no PAM support but is accessible with perl \
or other scripts."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.9"

RPM_NAME = "pam_script-1.1.9-2.7.aarch64.rpm"
RPM_HASH = "0f719fea1f967f79d67d8d402ff55d7ca8001f87b206deefb9ec22feb3d3f2dae457f02d5ebeaceb4c555d5d1bb7efb017a4e61a8f2bc95a1b24bf1dfe23721f"

RPROVIDES:${PN} += "config(pam_script) \
pam_script \
pam_script(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpam.so.0()(64bit)"

inherit rpm
