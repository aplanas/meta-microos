SUMMARY = "Plugin for transparent editing of gpg encrypted files"
DESCRIPTION = "This script implements transparent editing of gpg encrypted files. The filename \
must have a '.gpg', '.pgp' or '.asc' suffix. When opening such a file the \
content is decrypted, when opening a new file the script will ask for the \
recipients of the encrypted file. The file content will be encrypted to all \
recipients before it is written. The script turns off viminfo, swapfile, and \
undofile to increase security."
LICENSE = "GPL-1.0-or-later"

PV = "2.7.1"

RPM_NAME = "vim-plugin-gnupg-2.7.1-55.1.noarch.rpm"
RPM_HASH = "793c52dbe8a34e2d03f8bbe43181c89bba15faccb0dc159fef075911cc543e8a31bce4642a6aad1aa6386535c53fb31c4710a7f19274c6a9526ab3a0f4d8179d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-gnupg"

RDEPENDS:${PN} += "/usr/bin/sh \
gpg2"

inherit rpm
