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

PV = "1.5.3"

RPM_NAME = "python311-ConfigArgParse-1.5.3-1.7.noarch.rpm"
RPM_HASH = "5d2fcbbdcc3834db0777c974856bc80cf3d4fa92c67ed5264e5880f190014f4738a7dd1fbbe763d2bea54546db1b6fc9bb234acad97f4c427367b7220d00e337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(configargparse) \
python311-ConfigArgParse \
python311-configargparse \
python3dist(configargparse)"

RDEPENDS:${PN} += "python(abi) \
python311-PyYAML \
python311-setuptools"

inherit rpm
