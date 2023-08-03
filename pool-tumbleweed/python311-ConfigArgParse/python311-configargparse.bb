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

RPM_NAME = "python311-ConfigArgParse-1.7-1.1.noarch.rpm"
RPM_HASH = "07ac77faee710155d23fdf1b6ebd2030659ae28082a94ad41c84360ccd2bd343a48f569a89446b050d649a49325eef580bc2ccd1654a0e6bcb66ce9a80e8f50d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ConfigArgParse \
python3-configargparse \
python3.11dist-configargparse \
python311-ConfigArgParse \
python311-configargparse \
python3dist-configargparse"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-setuptools"

inherit rpm
