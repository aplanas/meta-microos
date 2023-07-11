SUMMARY = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid"
DESCRIPTION = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid."
LICENSE = "MIT"

PV = "0.13.1"

RPM_NAME = "python311-curlylint-0.13.1-1.6.noarch.rpm"
RPM_HASH = "e2a69ca70dc03674ec75810627c55367fa33e5e161972d0379e9f4e9045bb7235d163384453d516786190a939aac09026cf4b154c9fd87ebd12a7f4196ca898a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-curlylint \
python3.11dist-curlylint \
python311-curlylint \
python3dist-curlylint"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-attrs \
python311-click \
python311-parsy \
python311-pathspec \
python311-toml"

inherit rpm
