SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-html-2.1.0-1.2.noarch.rpm"
RPM_HASH = "42916e927ad1f771cd771b0cbcef3c77ca63fb578cbdeb7e383b8a072d9ae7828d25dc00ba20a78e710683f55b14d22058e1dc66c428720cfbee8604c59b8cb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-html"

RDEPENDS:${PN} += "python39-beautifulsoup4 \
python39-html5lib \
python39-lxml \
python39-pandas"

inherit rpm
