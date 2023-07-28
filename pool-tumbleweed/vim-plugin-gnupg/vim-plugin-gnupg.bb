SUMMARY = "Plugin for transparent editing of gpg encrypted files"
DESCRIPTION = "This script implements transparent editing of gpg encrypted files. The filename \
must have a '.gpg', '.pgp' or '.asc' suffix. When opening such a file the \
content is decrypted, when opening a new file the script will ask for the \
recipients of the encrypted file. The file content will be encrypted to all \
recipients before it is written. The script turns off viminfo, swapfile, and \
undofile to increase security."
LICENSE = "GPL-1.0-or-later"

PV = "2.7.1"

RPM_NAME = "vim-plugin-gnupg-2.7.1-56.1.noarch.rpm"
RPM_HASH = "39068a378a3926981c8bf12e5806961dfb719aad0a8c5d209953ff44bc37ba2bbe644cbeb561a59743e8d1b90d5222aae8bfe49be2b2772f19e2e63510c24881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-gnupg"

RDEPENDS:${PN} += "/usr/bin/sh \
gpg2"

inherit rpm
