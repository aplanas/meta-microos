SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-html-2.0.2-4.1.noarch.rpm"
RPM_HASH = "bb1963bc919e849b74a6f866131601c761f50430426f44999f1f5d7a0a4d332439f0cf3408ed43f1a40c67b6fd3d0c689b80054cc7e31e6c1dce12df4d1ad2b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-html"

RDEPENDS:${PN} += "python310-beautifulsoup4 \
python310-html5lib \
python310-lxml \
python310-pandas"

inherit rpm
