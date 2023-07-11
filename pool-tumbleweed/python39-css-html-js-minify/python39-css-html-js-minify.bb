SUMMARY = "CSS HTML JS Minifier"
DESCRIPTION = "Async single-file cross-platform no-dependencies Minifier for the Web"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.5.5.git.1523718195.8f72452"

RPM_NAME = "python39-css-html-js-minify-2.5.5.git.1523718195.8f72452-1.16.noarch.rpm"
RPM_HASH = "8bcbe227ff7829c43f8f6c6dfb63c3177326d10d8f181fcdcb286305cd19b670c6d90da0b81e12f22ee4bdb84c26d6f62a1acab57ee44c5dbd069e74ebf42d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-css-html-js-minify \
python39-css-html-js-minify \
python3dist-css-html-js-minify"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
