SUMMARY = "JavaScript minifier written in Python"
DESCRIPTION = "SlimIt is a JavaScript minifier written in Python. It compiles \
JavaScript into more compact code so that it downloads and runs \
faster. \
 \
SlimIt also provides a library that includes a JavaScript parser, \
lexer, pretty printer and a tree visitor."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python39-slimit-0.8.1-9.26.noarch.rpm"
RPM_HASH = "9c5e6a282e892fb2ed25407a26b23383d25ec55f35d5fe79d33ecd3a33b821a1bb64fb32b39395e9f9981f6861a58cef986c386b703d6f653362f88a362b8480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(slimit) \
python39-slimit \
python3dist(slimit)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-ply \
python39-setuptools \
update-alternatives"

inherit rpm
