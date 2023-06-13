SUMMARY = "A feature-rich command-line argument parser"
DESCRIPTION = "Argparse supports positional arguments, options, flags, optional \
arguments, subcommands and more. Argparse automatically generates usage, \
help, and error messages, and can generate shell completion scripts."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "lua54-argparse-0.7.0-4.2.noarch.rpm"
RPM_HASH = "4ab596c6a2b6e4af94d3813934371502dc4ade2af1520c5584a8cc08da4bd88a64acfcaf6e8e5e6a275377d2b7f3cd6384db9ff5515d75953ecd78455fb12590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-argparse \
lua54-argparse"

RDEPENDS:${PN} += "lua54"

inherit rpm
