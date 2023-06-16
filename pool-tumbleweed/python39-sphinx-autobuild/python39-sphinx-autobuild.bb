SUMMARY = "Rebuild Sphinx documentation on changes, with live-reload in the browser"
DESCRIPTION = "Rebuild Sphinx documentation on changes, with live-reload in the browser."
LICENSE = "MIT"

PV = "2021.3.14"

RPM_NAME = "python39-sphinx-autobuild-2021.3.14-1.2.noarch.rpm"
RPM_HASH = "2ee1f7a7d4867ddc60823a4bfbc321f4f8be8a509defa0573593059977fe95addbcf8184a8397734cee97964581ac18d3805880e57ce2601ffd1d58fc01c79d2"
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
