SUMMARY = "JavaScript minifier written in Python"
DESCRIPTION = "SlimIt is a JavaScript minifier written in Python. It compiles \
JavaScript into more compact code so that it downloads and runs \
faster. \
 \
SlimIt also provides a library that includes a JavaScript parser, \
lexer, pretty printer and a tree visitor."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python39-slimit-0.8.1-10.1.noarch.rpm"
RPM_HASH = "8635c45b483f01815e9618b70bcc760b86441719398b7f8a0660719833608ddcaa24d4ab804310e30fd2b11a8f8ed9ca501a07e55fd211fc26b99caf199c7bd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-slimit \
python39-slimit \
python3dist-slimit"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-ply \
python39-setuptools \
update-alternatives"

inherit rpm
