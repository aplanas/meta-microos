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

RPM_NAME = "python311-ptyprocess-0.7.0-2.1.noarch.rpm"
RPM_HASH = "247f21653002abb73a3b7314b6d78295b126faa8e28c7a639a64bdd56f8d4da9ed344a5f63e6a97d7f881e407d5a233a1a9c46c5708361fbd4ec3d01633dfb35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ptyprocess \
python311-ptyprocess \
python3dist-ptyprocess"

RDEPENDS:${PN} += "python-abi"

inherit rpm
