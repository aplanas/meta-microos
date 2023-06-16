SUMMARY = "Rebuild Sphinx documentation on changes, with live-reload in the browser"
DESCRIPTION = "Rebuild Sphinx documentation on changes, with live-reload in the browser."
LICENSE = "MIT"

PV = "2021.3.14"

RPM_NAME = "python310-sphinx-autobuild-2021.3.14-1.2.noarch.rpm"
RPM_HASH = "5f1d80dfe46a0b97eb9cd551dc47c2f071d0c8e375c864fedadd04f43b8879525703d17601187d93d9ff6f0558a80e7b51ca2b23ea0e715fd34c3048460f85a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-autobuild \
python3.10dist-sphinx-autobuild \
python310-sphinx-autobuild \
python3dist-sphinx-autobuild"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Sphinx \
python310-colorama \
python310-livereload \
update-alternatives"

inherit rpm
