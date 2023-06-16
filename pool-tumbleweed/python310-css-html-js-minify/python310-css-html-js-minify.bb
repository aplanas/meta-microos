SUMMARY = "CSS HTML JS Minifier"
DESCRIPTION = "Async single-file cross-platform no-dependencies Minifier for the Web"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.5.5.git.1523718195.8f72452"

RPM_NAME = "python310-css-html-js-minify-2.5.5.git.1523718195.8f72452-1.15.noarch.rpm"
RPM_HASH = "3f9e7a4c46aa8827c6ae2a2a7de062b78fa26be1aad88d04e328f309cafb636d07d12ad0186d9ae591fc1cd7b866a9f2b62dde29d4887a28669e3bb70806bb14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-css-html-js-minify \
python3.10dist-css-html-js-minify \
python310-css-html-js-minify \
python3dist-css-html-js-minify"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
