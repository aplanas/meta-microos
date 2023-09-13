SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-html-2.1.0-1.2.noarch.rpm"
RPM_HASH = "bc64b2938c653a4bc190f3706237246e144f62d4b8269e4fc4fd1a99e008adc96465c8e0e284c47b856bac32ffac49fdf38a8d37a287d11dd0e4e9054d684f08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-html"

RDEPENDS:${PN} += "python310-beautifulsoup4 \
python310-html5lib \
python310-lxml \
python310-pandas"

inherit rpm
