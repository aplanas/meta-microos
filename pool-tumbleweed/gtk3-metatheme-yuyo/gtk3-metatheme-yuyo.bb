SUMMARY = "Yuyo Gtk Theme -- GTK+ 3 Support"
DESCRIPTION = "Yuyo has light and dark variations and a flat style with crisp \
clean lines."
LICENSE = "GPL-3.0+"

PV = "0.3"

RPM_NAME = "gtk3-metatheme-yuyo-0.3-1.16.noarch.rpm"
RPM_HASH = "5e8a611af547f0e21094aeb13404861f5a51ae60daf822f7af38699f340c70b2533403432184075a5077ad255610889f3222ff10a71b5a422f46415a86722283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-yuyo"

RDEPENDS:${PN} += "metatheme-yuyo-common"

inherit rpm
