SUMMARY = "URL top level domain (TLD) extraction module"
DESCRIPTION = "This module extracts the top level domain (TLD) from the URL given. \
A list of TLD names is taken from Mozillas public suffix list: \
<https://publicsuffix.org/list/effective_tld_names.dat>"
LICENSE = "GPL-2.0-only | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.12.6"

RPM_NAME = "python310-tld-0.12.6-2.7.noarch.rpm"
RPM_HASH = "892a858380b4cdbc1cf12a11d1532337712952b069e3c6f0be96da4cb6aec7ce98588662c4e5cedc923014716dc46af6a2338ad24106e160078e14c66b691d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tld \
python310-tld \
python3dist-tld"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
