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

RPM_NAME = "python39-vulture-2.1-2.3.noarch.rpm"
RPM_HASH = "95449f1fc179947221f357193bf73e6a3a3e991b6f5432173e685065236dca463fe705a0d9dec02a5508de58d78beac2559e60c14545cbc9642863e8d06b9498"
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
