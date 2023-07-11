SUMMARY = "CSS HTML JS Minifier"
DESCRIPTION = "Async single-file cross-platform no-dependencies Minifier for the Web"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.5.5.git.1523718195.8f72452"

RPM_NAME = "python311-css-html-js-minify-2.5.5.git.1523718195.8f72452-1.16.noarch.rpm"
RPM_HASH = "0a03c789304b7b9fbfe23d8269ec5717f4f9a35accd1f57b6ba6c99a7aec13f89bbf911234cb9cfc2a9c3b58fdd1fd8f16cc0c69c442a283292ffd45fdade353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-css-html-js-minify \
python3.11dist-css-html-js-minify \
python311-css-html-js-minify \
python3dist-css-html-js-minify"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
