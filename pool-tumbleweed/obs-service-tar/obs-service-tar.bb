SUMMARY = "Creates a tar archive from local directory"
DESCRIPTION = "Creates a tar archive from local directory"
LICENSE = "GPL-2.0-or-later"

PV = "0.10.39"

RPM_NAME = "obs-service-tar-0.10.39-1.1.noarch.rpm"
RPM_HASH = "7693ae1a0f1b11d43c100738d1bd16c979db265b7dd807808e4826256930bcda60f34a93073605e3e9a429208260de0e783730214fba3cd9ee7f109b05ccc31d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-tar \
obs-service-tar-scm-/usr/lib/obs/service/tar.service"

RDEPENDS:${PN} += "obs-service-obs-scm-common"

inherit rpm
