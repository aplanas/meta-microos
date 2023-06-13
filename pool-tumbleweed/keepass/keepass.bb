SUMMARY = "Password Manager"
DESCRIPTION = "KeePass is a password manager, which helps you to manage your \
passwords. You can put all your passwords in one database, which is \
locked with one master key or a key file, so that you only have to \
remember one single master password or select the key file to unlock \
the whole database. The databases are encrypted using AES and \
Twofish."
LICENSE = "GPL-2.0-or-later"

PV = "2.53.1"

RPM_NAME = "keepass-2.53.1-1.3.noarch.rpm"
RPM_HASH = "b988b374e4d0b05240f7b8ffc8bfa4d3ddcf0c9669863aa883b46922516f5fff6d901ed0426ff36b2d12f18f582ab80ba5607eb8f7b62f04995a08106b2688e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(keepass.desktop) \
keepass \
mono(KeePass) \
mono(KeePassLib)"

RDEPENDS:${PN} += "mono(System) \
mono(System.Drawing) \
mono(System.Security) \
mono(System.Windows.Forms) \
mono(System.Xml) \
mono(mscorlib)"

inherit rpm
