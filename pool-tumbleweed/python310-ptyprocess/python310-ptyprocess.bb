SUMMARY = "Run a subprocess in a pseudo terminal"
DESCRIPTION = "Launch a subprocess in a pseudo terminal (pty), and interact with both the \
process and its pty. \
 \
Sometimes, piping stdin and stdout is not enough. There might be a password \
prompt that doesn't read from stdin, output that changes when it's going to a \
pipe rather than a terminal, or curses-style interfaces that rely on a terminal. \
If you need to automate these things, running the process in a pseudo terminal \
(pty) is the answer."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "python310-ptyprocess-0.7.0-2.2.noarch.rpm"
RPM_HASH = "5e8b0ab1fd601fc178a72643192b24b72977036e1fcffcc351d8b608796aff98c1abe255c58af35d190659cb9968c6f5232e4f9c9640d57a8400a0819280462b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ptyprocess \
python310-ptyprocess \
python3dist-ptyprocess"

RDEPENDS:${PN} += "python-abi"

inherit rpm
