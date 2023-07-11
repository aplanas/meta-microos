SUMMARY = "Translations for package gpg2"
DESCRIPTION = "Provides translations for the 'gpg2' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.8"

RPM_NAME = "gpg2-lang-2.3.8-3.1.noarch.rpm"
RPM_HASH = "8d6d44beff7a73abbdb3e582cb8fb6a115b80d3bb703a6f40f1b382e921cd8b6e575809bcb2227380089aaf3889a9eff13ec7a5ec70346c1e5e091920370dcfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpg2-lang \
gpg2-lang-all \
locale-gpg2-ca \
locale-gpg2-cs \
locale-gpg2-da \
locale-gpg2-de \
locale-gpg2-el \
locale-gpg2-eo \
locale-gpg2-es \
locale-gpg2-et \
locale-gpg2-fi \
locale-gpg2-fr \
locale-gpg2-gl \
locale-gpg2-hu \
locale-gpg2-id \
locale-gpg2-it \
locale-gpg2-ja \
locale-gpg2-nb \
locale-gpg2-pl \
locale-gpg2-pt \
locale-gpg2-ro \
locale-gpg2-ru \
locale-gpg2-sk \
locale-gpg2-sv \
locale-gpg2-tr \
locale-gpg2-uk \
locale-gpg2-zh-CN \
locale-gpg2-zh-TW"

RDEPENDS:${PN} += "gpg2"

inherit rpm
