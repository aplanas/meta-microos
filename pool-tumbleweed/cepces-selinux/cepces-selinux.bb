SUMMARY = "SELinux support for cepces"
DESCRIPTION = "SELinux support for cepces"
LICENSE = "GPL-3.0-or-later"

PV = "0.3.7"

RPM_NAME = "cepces-selinux-0.3.7-1.4.noarch.rpm"
RPM_HASH = "7052530ef9061d99adc3ad40639a5b099c06f3f8fdbab22c92b7df9e57a3b41622546be49d728423ce95e0c13956271a7d2418a68d79c0c1163abd994454e444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cepces-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
selinux-policy \
selinux-policy-targeted"

inherit rpm
