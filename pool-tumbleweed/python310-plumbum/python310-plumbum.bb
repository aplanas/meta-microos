SUMMARY = "Shell combinators library"
DESCRIPTION = "Plumbum is a library for shell script-like programs in Python. \
 \
Apart from shell-like syntax and handy shortcuts, the library \
provides local and remote command  execution (over SSH), local and \
remote file-system paths, working-directory and environment \
manipulation, and a programmatic Command-Line Interface (CLI) \
application toolkit."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "python310-plumbum-1.7.2-1.8.noarch.rpm"
RPM_HASH = "af5c8c7a712c82274a7ce42981f570373d26eb3ea3b8462acf0c6ee65830c1f3dd948c93d965573e2844400ab3e65a0e164d92085d7bec241e29958bc1f5a6da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-plumbum \
python310-plumbum \
python3dist-plumbum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
