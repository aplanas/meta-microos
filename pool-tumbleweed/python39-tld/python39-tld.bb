SUMMARY = "URL top level domain (TLD) extraction module"
DESCRIPTION = "This module extracts the top level domain (TLD) from the URL given. \
A list of TLD names is taken from Mozillas public suffix list: \
<https://publicsuffix.org/list/effective_tld_names.dat>"
LICENSE = "GPL-2.0-only | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.12.6"

RPM_NAME = "python39-tld-0.12.6-2.5.noarch.rpm"
RPM_HASH = "aba4c00c694ed15e06b6c1358874bcd3c45a30ac0c8c57f1c8533d5ad1095fd2569b3c68cfdc22ef8c5cb5082064aa899f15605c3347724eb5bd0329eaddaa02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tld \
python39-tld \
python3dist-tld"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
