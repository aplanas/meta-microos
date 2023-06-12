SUMMARY = "The 'Paper' theme for Gtk3"
DESCRIPTION = "Paper is a modern desktop theme suite. Its design is mostly flat \
with a minimal use of shadows for depth."
LICENSE = "GPL-3.0+"

PV = "2.1.0"

RPM_NAME = "gtk3-metatheme-paper-2.1.0-2.16.noarch.rpm"
RPM_HASH = "5056c65b36948bccf234a81fff3da5fc6429d115d9310953855ffbe2ab313838b3211f72dc9147178d72164c6be4c366a0193b0b120587c30da34134aad6bcd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-paper"
RDEPENDS:${PN} += "metatheme-paper-common"

inherit rpm
