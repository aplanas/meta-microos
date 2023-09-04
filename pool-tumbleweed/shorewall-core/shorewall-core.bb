SUMMARY = "Core libraries for Shorewall"
DESCRIPTION = "This package contains the core libraries for Shorewall."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-core-5.2.8-5.2.noarch.rpm"
RPM_HASH = "2cbd9d647eebe072880b8542d83d58ce6939fc2e69aab243e0e8cbd9eccbe3748017063e7a66c60914ddf12b0572c4ec70f209e95984da7b0280489e46560325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shorewall-core"

RDEPENDS:${PN} += "/usr/bin/sh \
iptables \
perl-base"

inherit rpm
