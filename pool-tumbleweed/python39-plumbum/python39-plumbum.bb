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

RPM_NAME = "python39-plumbum-1.7.2-1.8.noarch.rpm"
RPM_HASH = "2fa65b772676375b9e941ef62add342dcd855aad2d511166c83866f051baae8e7d3499aeee2159eacd4925eeaf59e0c9c4cf91468318c5bdf09ae17c4cfcf001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-plumbum \
python39-plumbum \
python3dist-plumbum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
