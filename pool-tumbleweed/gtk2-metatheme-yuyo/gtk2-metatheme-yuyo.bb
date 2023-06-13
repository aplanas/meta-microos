SUMMARY = "Yuyo Gtk Theme -- GTK+ 2 Support"
DESCRIPTION = "Yuyo has light and dark variations and a flat style with crisp \
clean lines."
LICENSE = "GPL-3.0+"

PV = "0.3"

RPM_NAME = "gtk2-metatheme-yuyo-0.3-1.16.noarch.rpm"
RPM_HASH = "744a334352f6f63710d4df980ada0183c02dbf2eca6eb2ea0a7441b58dea57ef64b26910c5c6dc8235722dccccd6201a9784d4a97ce1b84072f70d7a0d03e7cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-yuyo"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-yuyo-common"

inherit rpm
