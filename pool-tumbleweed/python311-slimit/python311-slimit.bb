SUMMARY = "JavaScript minifier written in Python"
DESCRIPTION = "SlimIt is a JavaScript minifier written in Python. It compiles \
JavaScript into more compact code so that it downloads and runs \
faster. \
 \
SlimIt also provides a library that includes a JavaScript parser, \
lexer, pretty printer and a tree visitor."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python311-slimit-0.8.1-10.1.noarch.rpm"
RPM_HASH = "531ce80b2193929eea279c2de447b642a0f31fd6694f8ef412b3ab7a3718140e324e175f36ec47647b829e0686ba2edd2ecd0a6201545b75e9e68f33a7b8932e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-slimit \
python3.11dist-slimit \
python311-slimit \
python3dist-slimit"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-ply \
python311-setuptools \
update-alternatives"

inherit rpm
