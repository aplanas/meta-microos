SUMMARY = "Rebuild Sphinx documentation on changes, with live-reload in the browser"
DESCRIPTION = "Rebuild Sphinx documentation on changes, with live-reload in the browser."
LICENSE = "MIT"

PV = "2021.3.14"

RPM_NAME = "python310-sphinx-autobuild-2021.3.14-1.4.noarch.rpm"
RPM_HASH = "9484fa62206f418cda76691be2e15d16ae798b1f67edea4cd0e4d6c06f615bfb25f4f4bb440e939cf60bc1f8880e87666661b7b9f1034443291981ff65f039b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-autobuild \
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
