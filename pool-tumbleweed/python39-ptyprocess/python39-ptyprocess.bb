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

RPM_NAME = "python39-ptyprocess-0.7.0-2.2.noarch.rpm"
RPM_HASH = "7f053f2c02a867decd30e2e17768562e00e63741c8aff109654731f0e59b6936cb8480a38d3b268c4e0c194386520503f5b3e23aa3f2da66e1674afca11dafa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ptyprocess \
python39-ptyprocess \
python3dist-ptyprocess"

RDEPENDS:${PN} += "python-abi"

inherit rpm
