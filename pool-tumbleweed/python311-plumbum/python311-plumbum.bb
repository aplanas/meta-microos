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

RPM_NAME = "python311-plumbum-1.7.2-1.8.noarch.rpm"
RPM_HASH = "d2146784c17d7fe543f3c0255401fd81f0f446abcd0f1760148f79e83a046e6c06cab9edb7a404013ce7d9d413cddb7e4d122b19214b9b15a76201e177284722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plumbum \
python3.11dist-plumbum \
python311-plumbum \
python3dist-plumbum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
