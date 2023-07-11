SUMMARY = "CSS HTML JS Minifier"
DESCRIPTION = "Async single-file cross-platform no-dependencies Minifier for the Web"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.5.5.git.1523718195.8f72452"

RPM_NAME = "python310-css-html-js-minify-2.5.5.git.1523718195.8f72452-1.16.noarch.rpm"
RPM_HASH = "e1690a19a895205e4588d585d620526a6639e03c621c99a4a221bbf45044746e7698a848cb49c8e49ae58944523fb308d47dc46e962871573077f24886b77cbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-css-html-js-minify \
python310-css-html-js-minify \
python3dist-css-html-js-minify"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
