SUMMARY = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid"
DESCRIPTION = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid."
LICENSE = "MIT"

PV = "0.13.1"

RPM_NAME = "python39-curlylint-0.13.1-1.4.noarch.rpm"
RPM_HASH = "4e8e782e0d5736ac7682d58de2f122bfe732548ab23e38b48e5e4d52dc2e4b4898276bd39c7b798e74b45a7006a4ae59b03c98b0e8fd23224f0af115ec882d09"
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
