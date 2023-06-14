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

RPM_NAME = "python310-ConfigArgParse-1.5.3-1.7.noarch.rpm"
RPM_HASH = "25ca9d708fa90a27a069446903f3b6bd7ffd8e9020e6b43f8c16ad8f55e8a526bcae2ca2cd385afdbbfa32b096a11c41d65a3b4eccb8f64e5e421f82147f576d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ConfigArgParse \
python3-configargparse \
python3.10dist-configargparse \
python310-ConfigArgParse \
python310-configargparse \
python3dist-configargparse"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-setuptools"

inherit rpm
