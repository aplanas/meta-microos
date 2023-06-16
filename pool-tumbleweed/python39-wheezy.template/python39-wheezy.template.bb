SUMMARY = "A lightweight template library"
DESCRIPTION = "A lightweight template library written in pure python."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-wheezy.template-3.1.0-1.1.noarch.rpm"
RPM_HASH = "5edc3a3283bc26d943b6c9e747001be2e8cd9faa3ffa7aaf6d4100e6deeeaff140193e561158f6e809a04ac9a28cedb7d6b10dd2e673ca6ec98e4e066ffee287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wheezy.template \
python39-wheezy.template \
python3dist-wheezy.template"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
