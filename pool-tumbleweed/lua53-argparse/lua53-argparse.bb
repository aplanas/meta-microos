SUMMARY = "A feature-rich command-line argument parser"
DESCRIPTION = "Argparse supports positional arguments, options, flags, optional \
arguments, subcommands and more. Argparse automatically generates usage, \
help, and error messages, and can generate shell completion scripts."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "lua53-argparse-0.7.0-4.2.noarch.rpm"
RPM_HASH = "851ff128c1b08f7afc0f5978f57d48af80f73ea9ca4f08a5ca90c2e1638a30ad500041d7cfaac03afd73f4471f15c820a21c80d99a767cc6948e3a839b3c1689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-argparse"

RDEPENDS:${PN} += "lua53"

inherit rpm
