SUMMARY = "Rebuild Sphinx documentation on changes, with live-reload in the browser"
DESCRIPTION = "Rebuild Sphinx documentation on changes, with live-reload in the browser."
LICENSE = "MIT"

PV = "2021.3.14"

RPM_NAME = "python311-sphinx-autobuild-2021.3.14-1.4.noarch.rpm"
RPM_HASH = "51d083b6a800b75d3a8a3f8efe02cd1f48e54dadbc967be843b3d65b7b84a5acf6834e4c6ae2d8fef9fe3e1a4d421be749921f2bc76f690e8197e33a1b5479a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-autobuild \
python3.11dist-sphinx-autobuild \
python311-sphinx-autobuild \
python3dist-sphinx-autobuild"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Sphinx \
python311-colorama \
python311-livereload \
update-alternatives"

inherit rpm
