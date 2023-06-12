SUMMARY = "JavaScript minifier written in Python"
DESCRIPTION = "SlimIt is a JavaScript minifier written in Python. It compiles \
JavaScript into more compact code so that it downloads and runs \
faster. \
 \
SlimIt also provides a library that includes a JavaScript parser, \
lexer, pretty printer and a tree visitor."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python311-slimit-0.8.1-9.26.noarch.rpm"
RPM_HASH = "480b6caed0837b2c8a2b2ca83ab658f97ff463d563e9b3823620b79c0760e47f078b300a1dc06a0e38df7bb83756492fe90de4140427a7477fc7325ab2226c2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(slimit) \
python311-slimit \
python3dist(slimit)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-ply \
python311-setuptools \
update-alternatives"

inherit rpm
