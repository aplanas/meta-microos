SUMMARY = "Python library to query Google Scholar"
DESCRIPTION = "This package provides a python package and CLI to query google scholar \
and get references in various formats (e.g. bibtex, endnote, etc.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-gscholar-2.1.0-1.6.noarch.rpm"
RPM_HASH = "7f24a2876d91d13ecbbc20a3da4fd8218d166d861b75cefbc528b4f16426c66c1b7856e2bc92942236efb621274d671efc072039f86410fc649c397a4bab4ac5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gscholar \
python310-gscholar \
python3dist-gscholar"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
