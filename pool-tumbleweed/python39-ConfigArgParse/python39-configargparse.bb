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

RPM_NAME = "python39-ConfigArgParse-1.5.5-1.1.noarch.rpm"
RPM_HASH = "981be41e2aa4caba3176af541f2b6e60a7133799a7a2ae007bc816d02bc3ad359093e35d99531646655419447c35e0c09995182d6d32a03e4f71ba8dd52d5ee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-configargparse \
python39-ConfigArgParse \
python39-configargparse \
python3dist-configargparse"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-setuptools"

inherit rpm
