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

RPM_NAME = "urlwatch-2.28-1.2.noarch.rpm"
RPM_HASH = "85ffc7f713fa937bca50c4b1d14193be3a4d267ab0d275df8a6530e639e81155e3f44df4a60d760e27c1e43fad6eb559dea48ee0591c6e297c6455be6d16147c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-urlwatch \
python3dist-urlwatch \
urlwatch"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-appdirs \
python3-cssselect \
python3-lxml \
python3-minidb \
python3-requests"

inherit rpm
