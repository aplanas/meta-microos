SUMMARY = "Python library to query Google Scholar"
DESCRIPTION = "This package provides a python package and CLI to query google scholar \
and get references in various formats (e.g. bibtex, endnote, etc.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-gscholar-2.1.0-1.6.noarch.rpm"
RPM_HASH = "c48b28e4fe0e9e92345e13d294520500761cb7e2beb7fdad2a7d99b7776b1f80d07b5799daa213fceecb39e8981be2ec8257ace025030e066f55de34e6fb33d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gscholar \
python3.11dist-gscholar \
python311-gscholar \
python3dist-gscholar"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
