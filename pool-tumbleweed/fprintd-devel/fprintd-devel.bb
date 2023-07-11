SUMMARY = "Development files for fprintd"
DESCRIPTION = "Development documentation for fprintd, the D-Bus service for \
fingerprint readers access."
LICENSE = "GFDL-1.1-or-later"

PV = "1.94.2"

RPM_NAME = "fprintd-devel-1.94.2-2.5.noarch.rpm"
RPM_HASH = "fe8e94b3ce202efa95b76e7c7bd142a28c11b456a8d2176b6d09328ad27e42822130977259c751df4df0df117d96151169505c8d35a9fcac70e89551aadf29d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fprintd-devel"

RDEPENDS:${PN} += "fprintd \
gtk-doc"

inherit rpm
