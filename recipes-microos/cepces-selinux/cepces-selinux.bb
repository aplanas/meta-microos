SUMMARY = "SELinux support for cepces"
DESCRIPTION = "SELinux support for cepces"
LICENSE = "GPL-3.0-or-later"

PV = "0.3.7"

RPM_NAME = "cepces-selinux-0.3.7-1.3.noarch.rpm"
RPM_HASH = "f0463ff9a9c3b233d6e53842e8df78613829827a5877dfdcf11e7832e5eb485775cadc1919d204849bf9b2fb9dc0ea376863093472b19ccc194e84c8e62ac2f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cepces-selinux"
RDEPENDS:${PN} += "/bin/sh \
selinux-policy \
selinux-policy-targeted"

inherit rpm
