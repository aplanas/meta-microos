SUMMARY = "Powerline Fonts"
DESCRIPTION = "This package provides the powerline fonts."
LICENSE = "MIT"

PV = "2.8.3"

RPM_NAME = "powerline-fonts-2.8.3-2.2.noarch.rpm"
RPM_HASH = "071f163e64fc85f97141cc7206e4e203ca09f6102abc176e38ac7cdc2e9130813619c0140e7cb0b3fca253ee2cb61c6321fea7f01f307ce19e7c3316f22efd11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(powerlinesymbols) \
powerline-fonts"
RDEPENDS:${PN} += "fontconfig"

inherit rpm
