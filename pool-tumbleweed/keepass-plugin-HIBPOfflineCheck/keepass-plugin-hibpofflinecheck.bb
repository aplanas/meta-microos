SUMMARY = "A KeePass plugin for Have I been pwned"
DESCRIPTION = "A Keepass plugin that performs offline and online checks against HaveIBeenPwned passwords. \
Check can be performed both during password generation and editing or in batch over the whole \
database."
LICENSE = "GPL-3.0-only"

PV = "1.7.10"

RPM_NAME = "keepass-plugin-HIBPOfflineCheck-1.7.10-1.3.noarch.rpm"
RPM_HASH = "c7b8a66ebc2301706524f706e825490f4e47e835ef4c08fc8c51dc1c5f4d37fa4cc36ac4177a385c4c45976a0302ae737443c6b522532520ecc692f0076bf097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keepass-plugin-HIBPOfflineCheck \
mono-HIBPOfflineCheck"

RDEPENDS:${PN} += "keepass \
mono-KeePass \
mono-System \
mono-System.Drawing \
mono-System.Windows.Forms \
mono-mscorlib"

inherit rpm
