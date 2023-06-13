SUMMARY = "The 'Paper' theme for Gtk2"
DESCRIPTION = "Paper is a modern desktop theme suite. Its design is mostly flat \
with a minimal use of shadows for depth."
LICENSE = "GPL-3.0+"

PV = "2.1.0"

RPM_NAME = "gtk2-metatheme-paper-2.1.0-2.16.noarch.rpm"
RPM_HASH = "8ff9b21029de4f8bebe8b4c5e8402990015c0040f0b8bf9ef1856553e54262be88245823166f5f1d950faa8f7de262c61ee60da9d045037d89d48d19267122e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-paper"

RDEPENDS:${PN} += "metatheme-paper-common"

inherit rpm
