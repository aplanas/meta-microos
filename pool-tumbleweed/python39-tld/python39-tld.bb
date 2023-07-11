SUMMARY = "URL top level domain (TLD) extraction module"
DESCRIPTION = "This module extracts the top level domain (TLD) from the URL given. \
A list of TLD names is taken from Mozillas public suffix list: \
<https://publicsuffix.org/list/effective_tld_names.dat>"
LICENSE = "GPL-2.0-only | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.12.6"

RPM_NAME = "python39-tld-0.12.6-2.7.noarch.rpm"
RPM_HASH = "521ebc941ebfb61c8560c8443dc35dc0f2fe716196e66e3666ce5c49ec8481fe427c7f4aec9e03e9d22868cc8496d326ce794aba513340e23a884013b49ad5f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tld \
python39-tld \
python3dist-tld"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
