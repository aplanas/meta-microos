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

RPM_NAME = "python39-plumbum-1.7.2-1.6.noarch.rpm"
RPM_HASH = "9b43b7c00238abf2689002b3e765d75f200521a88e37e0247618cbaced3cf276ce19ced2e6cd6562362a87c0bf661f0012e0c7ffb7e0aff4c60a6e1a18fc7265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(plumbum) \
python39-plumbum \
python3dist(plumbum)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
