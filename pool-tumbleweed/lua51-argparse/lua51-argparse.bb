SUMMARY = "A feature-rich command-line argument parser"
DESCRIPTION = "Argparse supports positional arguments, options, flags, optional \
arguments, subcommands and more. Argparse automatically generates usage, \
help, and error messages, and can generate shell completion scripts."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "lua51-argparse-0.7.0-4.2.noarch.rpm"
RPM_HASH = "21cbad4951e7acf9237f1d3cc2e5335ae9dc522f1de692abfe3a18acfe36d84d92a7507899b7a268896547810878a3fc9cd25da79b4db34cbf4d1098051022f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-argparse"

RDEPENDS:${PN} += "lua51"

inherit rpm
