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

RPM_NAME = "python311-vulture-2.1-2.3.noarch.rpm"
RPM_HASH = "5d98048a2506ca1fac7ac226ebc012f9e106d60ecc8896cb9837bd34c0424ac5ce69fd6c4d0f85f5db6ee0e73f43538869789201e5443dd17014e6fc0aee22a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vulture \
python3.11dist-vulture \
python311-vulture \
python3dist-vulture"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-toml \
update-alternatives"

inherit rpm
