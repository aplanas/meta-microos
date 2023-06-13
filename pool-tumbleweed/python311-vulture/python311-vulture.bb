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

RPM_NAME = "python311-vulture-2.1-1.13.noarch.rpm"
RPM_HASH = "3171726e4da9259f5fec6034fb033bc69c9b2fe719db60d82fd5ece31b97dbda5a1953743125fb40b506c6b5ddc58787849209763b01883231869b6122f81f0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vulture) \
python311-vulture \
python3dist(vulture)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-toml \
update-alternatives"

inherit rpm
