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

RPM_NAME = "python311-plumbum-1.7.2-1.6.noarch.rpm"
RPM_HASH = "3cf3917f1a4241f880627853f61ed8a51db881c87831e408b6407f15aa18340dae07ed10425c4b0e7670534a5c2d8a17a97d6b39581588dec02d99cd4a97af1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-plumbum \
python311-plumbum \
python3dist-plumbum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
