SUMMARY = "Enhanced Python `compileall` module"
DESCRIPTION = "Enhanced Python `compileall` module."
LICENSE = "Python-2.0"

PV = "0.7.2"

RPM_NAME = "python310-compileall2-0.7.2-1.4.noarch.rpm"
RPM_HASH = "19b81d3faba51037d42d340be715ebe8692b6e75b85d7c09e9490c4df9d22ec56250111ed5860c73c4f948d6a647bcc1d41d68eef54a112e1959ea16d2a3423b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-compileall2 \
python3.10dist(compileall2) \
python310-compileall2 \
python3dist(compileall2)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi)"

inherit rpm
