SUMMARY = "JavaScript minifier written in Python"
DESCRIPTION = "SlimIt is a JavaScript minifier written in Python. It compiles \
JavaScript into more compact code so that it downloads and runs \
faster. \
 \
SlimIt also provides a library that includes a JavaScript parser, \
lexer, pretty printer and a tree visitor."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python310-slimit-0.8.1-10.1.noarch.rpm"
RPM_HASH = "203f3112119f477a8ffa01a52655b83014cb39e7665ff5d6c1a3876ca5af467e4732d14895b1340dc294cf5bbda7d86eb20894ebd7abe1f3e8c815a50dee4db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-slimit \
python310-slimit \
python3dist-slimit"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-ply \
python310-setuptools \
update-alternatives"

inherit rpm
