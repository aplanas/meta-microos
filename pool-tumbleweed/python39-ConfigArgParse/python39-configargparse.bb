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

PV = "1.7"

RPM_NAME = "python39-ConfigArgParse-1.7-1.1.noarch.rpm"
RPM_HASH = "efa230b505684592becb8deb0e63099e1fc1d8f843800771e62010555a8adfa870dca3b8e0347a2e98de659eb02654d71a9075c4df37d9b7992cdf2abc5e0149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-configargparse \
python39-ConfigArgParse \
python39-configargparse \
python3dist-configargparse"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-setuptools"

inherit rpm
