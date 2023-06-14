SUMMARY = "Rebuild Sphinx documentation on changes, with live-reload in the browser"
DESCRIPTION = "Rebuild Sphinx documentation on changes, with live-reload in the browser."
LICENSE = "MIT"

PV = "2021.3.14"

RPM_NAME = "python311-sphinx-autobuild-2021.3.14-1.2.noarch.rpm"
RPM_HASH = "9b75f7bc534b3b294bbb32772af72a2643d1ebd50242755e2343ac82d49a6a774a9e5113143e1ab6d4b76e6698951aba01e719c1b4f8fd9b6cbc19d76c7385dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinx-autobuild \
python311-sphinx-autobuild \
python3dist-sphinx-autobuild"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-Sphinx \
python311-colorama \
python311-livereload \
update-alternatives"

inherit rpm
