SUMMARY = "Python libary to flatten multi-file RELAX NG schemas"
DESCRIPTION = "The rnginline package is a Python library and command-line tool for \
multi-file RELAX NG schemas from arbitary URLs, and flattening them \
into a single RELAX NG schema."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python310-rnginline-1.0.0-1.3.noarch.rpm"
RPM_HASH = "3a3ac8e43700c455a12642e74d81011d1e809e1225da783260058fa8f12bf874b832c8439dbfa22862cf01d8bceb83d7a7e5217caaeaa3b88d5ca30fff5224f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rnginline \
python310-rnginline \
python3dist-rnginline"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docopt \
python310-importlib-resources \
python310-lxml \
python310-typing-extensions \
update-alternatives"

inherit rpm
