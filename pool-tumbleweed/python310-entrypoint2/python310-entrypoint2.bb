SUMMARY = "Command-line interface for python modules"
DESCRIPTION = "entrypoint2 is a command-line interface for python modules, forked \
off entrypoint."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python310-entrypoint2-1.1-1.3.noarch.rpm"
RPM_HASH = "ab62cd03c760056246b3c88cbabfb7ca27b2c10a44e52472ffbe38858b506d667bd08e97f209371fbed7417419449f463d63d97687832f3598e917017d1908eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-entrypoint2 \
python3.10dist(entrypoint2) \
python310-entrypoint2 \
python3dist(entrypoint2)"
RDEPENDS:${PN} += "python(abi) \
python310-EasyProcess \
python310-decorator \
python310-path.py"

inherit rpm
