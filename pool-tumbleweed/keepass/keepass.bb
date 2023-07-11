SUMMARY = "Password Manager"
DESCRIPTION = "KeePass is a password manager, which helps you to manage your \
passwords. You can put all your passwords in one database, which is \
locked with one master key or a key file, so that you only have to \
remember one single master password or select the key file to unlock \
the whole database. The databases are encrypted using AES and \
Twofish."
LICENSE = "GPL-2.0-or-later"

PV = "2.54"

RPM_NAME = "keepass-2.54-1.2.noarch.rpm"
RPM_HASH = "ac6be84233c59fa6ddfa620568e3b70e5609f744aeb7abe2d1f99aded18ab2fe4b643c47fd913e3dfe9c391e94e2ec67ea48ee8cb2dd4c74e58d772281b32347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keepass \
mono-KeePass \
mono-KeePassLib"

RDEPENDS:${PN} += "mono-System \
mono-System.Drawing \
mono-System.Security \
mono-System.Windows.Forms \
mono-System.Xml \
mono-mscorlib"

inherit rpm
