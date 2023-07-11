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

RPM_NAME = "python310-vulture-2.1-2.3.noarch.rpm"
RPM_HASH = "033db7307ffe9370b5edcefd0147b5abc6640efe38ab0d60125819674af1263a42e38b812b4eb3f8d967f8c6edf1a4f721c92043487c4e7653fea3cede8a89b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vulture \
python310-vulture \
python3dist-vulture"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-toml \
update-alternatives"

inherit rpm
