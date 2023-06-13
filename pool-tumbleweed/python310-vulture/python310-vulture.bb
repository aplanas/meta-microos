SUMMARY = "Python module for finding dead code"
DESCRIPTION = "Vulture finds unused code in Python programs. This is useful for \
cleaning up and finding errors in code bases. Running Vulture \
on both the library and test suite, untested code can be found. \
 \
Due to Python's dynamic nature, static code analyzers like Vulture are \
likely to miss some dead code. Also, code that is only called implicitly \
may be reported as unused. \
 \
Features: \
 \
* static code analysis \
* only one module \
* tests itself and has complete test coverage \
* complements pyflakes and has the same output syntax \
* sorts unused classes and functions by size with ``--sort-by-size`` \
* supports Python 2.6, 2.7 and 3.x"
LICENSE = "MIT"

PV = "2.1"

RPM_NAME = "python310-vulture-2.1-1.13.noarch.rpm"
RPM_HASH = "9dc1f4840fa25e2d02e2c477f154af5ace177a08b5ab98e3516c5bec6c4e8a60020ef74ad31ad67ff0b180d91747f55ed8e0871f190aecde4500407762e30876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vulture \
python3.10dist(vulture) \
python310-vulture \
python3dist(vulture)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-toml \
update-alternatives"

inherit rpm
