SUMMARY = "A drop-in replacement for argparse"
DESCRIPTION = "ConfigArgParse allows options to also be set via config files and/or environment \
variables. \
 \
Applications with more than a handful of user-settable options are best configured \
through a combination of command line args, config files, hard-coded defaults, and \
in some cases, environment variables. \
 \
Python’s command line parsing modules such as argparse have very limited support \
for config files and environment variables, so this module extends argparse to \
add these features"
LICENSE = "MIT"

PV = "1.5.5"

RPM_NAME = "python310-ConfigArgParse-1.5.5-1.1.noarch.rpm"
RPM_HASH = "0577c46b644176ecc3a027cd063f5b49a398775be96be40aa468ce3d41946497ffa192b548506e7249711d7fc3c7acd75642ba42675e0e95c4cf1875b4b5acc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-configargparse \
python310-ConfigArgParse \
python310-configargparse \
python3dist-configargparse"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-setuptools"

inherit rpm
