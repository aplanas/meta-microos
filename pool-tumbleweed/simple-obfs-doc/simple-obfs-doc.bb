SUMMARY = "Documents for simple-obfs"
DESCRIPTION = "Simple-obfs is a simple obfusacting tool, designed as plugin server of shadowsocks. \
 \
This package provides Documents for it."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.5"

RPM_NAME = "simple-obfs-doc-0.0.5-4.16.noarch.rpm"
RPM_HASH = "582da0ab0bc086bf3cdd4317267376b7691e07bc17e8d5cb5a157113e051a9736457eeadf67a371fa314116cfe0902c95c3a1f977848f318d34b578af90739b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "simple-obfs-doc"

RDEPENDS:${PN} += "simple-obfs"

inherit rpm
