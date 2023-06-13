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

RPM_NAME = "python310-ptyprocess-0.7.0-2.1.noarch.rpm"
RPM_HASH = "073e8d808c9bd7da48046b6fa6d46a62073975bdd36bf081c97442f17fe53200fb09d4cf6186d39b83681e93026da3e9f280a1b957f5ca6c5e20edb151719635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ptyprocess \
python3.10dist(ptyprocess) \
python310-ptyprocess \
python3dist(ptyprocess)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
