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

RPM_NAME = "python310-ConfigArgParse-1.7-1.1.noarch.rpm"
RPM_HASH = "e53879ff9639fdd2fbebce25ba9b4db4ca9d5d6633e884363e57b8fce0bee6c9389515a522ec241f9899413e9922cf0bd560846516c0a977509baf506d28e452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-configargparse \
python310-ConfigArgParse \
python310-configargparse \
python3dist-configargparse"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-setuptools"

inherit rpm
