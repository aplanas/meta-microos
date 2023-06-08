SUMMARY = "GSettings deepin desktop-wide schemas"
DESCRIPTION = "deepin-desktop-schemas contains a collection of GSettings schemas for \
settings shared by various components of a desktop."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.11"

RPM_NAME = "deepin-desktop-schemas-5.10.11-1.4.noarch.rpm"
RPM_HASH = "8f579240fb059034371606d4eb55f954ab84ad10e672f3c603ee7fa517fe3ac8297b069a095e099afbdb6a408658018ce9a086c273642aa73bbcb73f9c9b82e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-desktop-schemas"
RDEPENDS:${PN} += "dconf"

inherit rpm
