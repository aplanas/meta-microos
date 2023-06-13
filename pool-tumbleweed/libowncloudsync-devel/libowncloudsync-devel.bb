SUMMARY = "Development files for the ownCloud synchronization library"
DESCRIPTION = "Development files for the ownCloud synchronization library. It \
implements the ownCloud sync algorithm that keeps a local directory \
in sync with the content on your cloud."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "3.2.0"

RPM_NAME = "libowncloudsync-devel-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "a8fed812a0900165fb436b957eef62e7f19dfb6f8ea867ded11a20d92e076fa8cc0f0c42503a381330dfb284ce53d60daa7a584a301251df74d06a07bb3d8267"

RPROVIDES:${PN} += "cmake(ownCloud) \
libowncloudsync-devel \
libowncloudsync-devel(aarch-64)"

RDEPENDS:${PN} += "libowncloudsync0"

inherit rpm
