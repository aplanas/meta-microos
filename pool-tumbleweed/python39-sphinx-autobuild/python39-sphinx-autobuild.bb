SUMMARY = "Rebuild Sphinx documentation on changes, with live-reload in the browser"
DESCRIPTION = "Rebuild Sphinx documentation on changes, with live-reload in the browser."
LICENSE = "MIT"

PV = "2021.3.14"

RPM_NAME = "python39-sphinx-autobuild-2021.3.14-1.4.noarch.rpm"
RPM_HASH = "97fa9c167d9184aa88fa4cb71a6a2173690091284a9804bb9aefcc4642e51f6f3a2a75975657302493bb67029da3c40acbcf296efc109e9fdc90ac90c3406d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-autobuild \
python39-sphinx-autobuild \
python3dist-sphinx-autobuild"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Sphinx \
python39-colorama \
python39-livereload \
update-alternatives"

inherit rpm
