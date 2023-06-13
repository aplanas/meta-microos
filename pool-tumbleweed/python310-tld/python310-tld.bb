SUMMARY = "URL top level domain (TLD) extraction module"
DESCRIPTION = "This module extracts the top level domain (TLD) from the URL given. \
A list of TLD names is taken from Mozillas public suffix list: \
<https://publicsuffix.org/list/effective_tld_names.dat>"
LICENSE = "GPL-2.0-only | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.12.6"

RPM_NAME = "python310-tld-0.12.6-2.5.noarch.rpm"
RPM_HASH = "d725859855ed6187c40234bdbcb44d3a223c6eaeb8f914408057fc2730f23a8c2f63b7a28fd345ea3f239829672a39a95474a2b57036a30c8fe101bd46c3e344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tld \
python3.10dist(tld) \
python310-tld \
python3dist(tld)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm
