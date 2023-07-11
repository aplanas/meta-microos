SUMMARY = "URL top level domain (TLD) extraction module"
DESCRIPTION = "This module extracts the top level domain (TLD) from the URL given. \
A list of TLD names is taken from Mozillas public suffix list: \
<https://publicsuffix.org/list/effective_tld_names.dat>"
LICENSE = "GPL-2.0-only | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.12.6"

RPM_NAME = "python311-tld-0.12.6-2.7.noarch.rpm"
RPM_HASH = "dba4fe6968a40a39563a7731775abc8dcd3f7f7e04f19359999b646d2ee07c87ea2bc4f7cb3033e721bb7d320aa6d70c637faa13f340fc12994eaf129950f305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tld \
python3.11dist-tld \
python311-tld \
python3dist-tld"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
