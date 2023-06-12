SUMMARY = "post checks for build after rpms have been created"
DESCRIPTION = "some scripts to check for problems like test-installing the newly \
created rpms and checking the logfile for errors. \
 \
This package will also set/change the following sysconfig variables, so \
it may not be a good idea to install this to a running system: \
/etc/sysconfig/security:PERMISSION_SECURITY='secure' \
/etc/sysconfig/clock:TIMEZONE='UTC'"
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230328.de7e9df"

RPM_NAME = "post-build-checks-84.87+git20230328.de7e9df-1.1.noarch.rpm"
RPM_HASH = "74a721c0078a7c17497f37024413059a9bb90fd28d1d53935d6f30b78c059402948275050099c01903588d11d320e518a5bc35bf04b6eabee67aafa735d1983c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(RPMQ) \
post-build-checks"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
aaa_base \
aaa_base-malloccheck \
gawk \
permissions \
sed"

inherit rpm
