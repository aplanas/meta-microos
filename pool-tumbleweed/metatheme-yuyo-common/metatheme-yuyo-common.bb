SUMMARY = "Yuyo Gtk Theme -- Common Files"
DESCRIPTION = "Yuyo has light and dark variations and a flat style with crisp \
clean lines."
LICENSE = "GPL-3.0+"

PV = "0.3"

RPM_NAME = "metatheme-yuyo-common-0.3-1.16.noarch.rpm"
RPM_HASH = "a14b527caed5a8f5afd6605608ef9f52eefe4260569239452aa6a434c6f621e4c5c548fea69a74d413e82f0e73d77d1086614981bdb22b5d293d896632258843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-yuyo-common"
RDEPENDS:${PN} += ""

inherit rpm
