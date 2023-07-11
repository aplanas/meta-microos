SUMMARY = "Python library to query Google Scholar"
DESCRIPTION = "This package provides a python package and CLI to query google scholar \
and get references in various formats (e.g. bibtex, endnote, etc.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-gscholar-2.1.0-1.6.noarch.rpm"
RPM_HASH = "ab2dbfbb9e08da6be13fbc2eb27502811d74ead0753555bd86df7efb3f936a22248aea434b70e94dc78bde11ef0141246b506fbb456ec0d26326d369267cdb9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gscholar \
python39-gscholar \
python3dist-gscholar"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
