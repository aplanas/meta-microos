SUMMARY = "Steamtricks companion data repository"
DESCRIPTION = "steamtricks companion data repository \
 \
While steamtricks is the client/daemon that triggers and applies fixes, \
steamtricks-data is the repository that provides the instructions for making the \
fixes."
LICENSE = "GPL-2.0"

PV = "20180128.f77bb8e"

RPM_NAME = "steamtricks-data-20180128.f77bb8e-1.12.noarch.rpm"
RPM_HASH = "efe8acc055119a06727773cb486ea179c288eb566e91393946bab9bbf5ded04a9ce7ea04159754a74a7237dbd45585acb418e59b2dcdc231e3439339fd472e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "steamtricks-data"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/env \
bsdiff \
steamtricks"

inherit rpm
