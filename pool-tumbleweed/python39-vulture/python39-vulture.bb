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

RPM_NAME = "python39-vulture-2.1-1.13.noarch.rpm"
RPM_HASH = "08b69c5f9114b92d370ff4f613a6f15bb5750f150e4788223ead6df09b1cb56bc2b3f7d5add9d85f4b0836a26f75d2d4eafc9435781c39464bbd3438d405b563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vulture \
python39-vulture \
python3dist-vulture"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-toml \
update-alternatives"

inherit rpm
