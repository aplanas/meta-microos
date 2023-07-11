SUMMARY = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid"
DESCRIPTION = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid."
LICENSE = "MIT"

PV = "0.13.1"

RPM_NAME = "python310-curlylint-0.13.1-1.6.noarch.rpm"
RPM_HASH = "45ac19b8c55bdd6fa199da0dcc62e86344797b14c3fb4ef879997f0581cab83e477e132671e9354a3fb31adc60a009290e01ca8975d68dee935f89775099ea8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-curlylint \
python310-curlylint \
python3dist-curlylint"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-attrs \
python310-click \
python310-parsy \
python310-pathspec \
python310-toml"

inherit rpm
