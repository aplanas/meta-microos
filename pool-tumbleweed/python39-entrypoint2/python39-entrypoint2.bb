SUMMARY = "Command-line interface for python modules"
DESCRIPTION = "entrypoint2 is a command-line interface for python modules, forked \
off entrypoint."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python39-entrypoint2-1.1-2.2.noarch.rpm"
RPM_HASH = "07809494b6a2c53e7965b0d9cfab433656743abe0bee29843d9cfc6dffc532f769c6c56392f13b13cb8b7c244dd19f21f4cd53263d7172b58e383270db125551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-entrypoint2 \
python39-entrypoint2 \
python3dist-entrypoint2"

RDEPENDS:${PN} += "python-abi \
python39-EasyProcess \
python39-decorator \
python39-path.py"

inherit rpm
