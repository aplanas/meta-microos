SUMMARY = "A tool for monitoring webpages for updates"
DESCRIPTION = "urlwatch is intended to help you watch changes in webpages and get \
notified (via email, in your terminal or with a custom-written \
reporter class) of any changes. The change notification will include \
the URL that has changed and a unified diff of what has changed. \
 \
A default config is ~/.urlwatch/urlwatch.yaml. \
use 'urlwatch --edit-config' to customize it. \
 \
You need to create ~/.urlwatch/urls.yaml in order to use urlwatch. \
Use 'urlwatch --edit' to open the file with your editor. \
 \
Please look in \
 \
 /usr/share/doc/packages/urlwatch/README.md \
 \
 TIPS AND TRICKS what to use in urls.yaml."
LICENSE = "BSD-3-Clause"

PV = "2.28"

RPM_NAME = "urlwatch-2.28-1.1.noarch.rpm"
RPM_HASH = "5d5726d4eacc990d7d4459951cf59fd074e5a4307fb713ba286c1055f2d85996f519ea5fe535b02e45cae4ed6e990e9063356b7dd62ab30b7553bf43fa3644d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(urlwatch) \
python3dist(urlwatch) \
urlwatch"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-PyYAML \
python3-appdirs \
python3-cssselect \
python3-lxml \
python3-minidb \
python3-requests"

inherit rpm
