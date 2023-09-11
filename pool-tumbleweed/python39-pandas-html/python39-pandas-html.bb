SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-html-2.0.3-1.3.noarch.rpm"
RPM_HASH = "b9da292a6a72f2f21342ac1e4bf43a0ccadf614aea063293314495ce5106bc1269cd3273c0b87562ef1ae1c66dc8abebc29fc2fa45b699ad24ddfa5cf3525b06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-html"

RDEPENDS:${PN} += "python39-beautifulsoup4 \
python39-html5lib \
python39-lxml \
python39-pandas"

inherit rpm
