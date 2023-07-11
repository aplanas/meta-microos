SUMMARY = "GSettings deepin desktop-wide schemas"
DESCRIPTION = "deepin-desktop-schemas contains a collection of GSettings schemas for \
settings shared by various components of a desktop."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.11"

RPM_NAME = "deepin-desktop-schemas-5.10.11-2.3.noarch.rpm"
RPM_HASH = "9ac7fe7ac8d940e1dba4f5d0fdd218b6d9a2fd74ff8705a08be9577c4d231cf320a508621475f5d0da337eadcd4fec9502251eb0768221d8bd6bf9f0bb9fc6d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-desktop-schemas"

RDEPENDS:${PN} += "dconf"

inherit rpm
