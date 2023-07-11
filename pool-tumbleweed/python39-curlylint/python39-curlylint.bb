SUMMARY = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid"
DESCRIPTION = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid."
LICENSE = "MIT"

PV = "0.13.1"

RPM_NAME = "python39-curlylint-0.13.1-1.6.noarch.rpm"
RPM_HASH = "e0ad43b7e031d099bfa8f40874d523ef8cdb667de64e56c8d8d5ca9550a280c0563d5452c10a14bf9ea1fca28467b6dfff84bed75402891699aed9896540c00e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-curlylint \
python39-curlylint \
python3dist-curlylint"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-attrs \
python39-click \
python39-parsy \
python39-pathspec \
python39-toml"

inherit rpm
