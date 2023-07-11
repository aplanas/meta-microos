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

RPM_NAME = "python311-ConfigArgParse-1.5.5-1.1.noarch.rpm"
RPM_HASH = "eae3bb1c3495e98f510a92117299de12fb322298726e326f92ebd29ce2c888ec6d8a7057103005b912ac674afe30ade227de56c592f09ef604a20d455c3d2258"
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
