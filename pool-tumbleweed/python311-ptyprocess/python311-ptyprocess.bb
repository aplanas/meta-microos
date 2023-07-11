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

RPM_NAME = "python311-ptyprocess-0.7.0-2.2.noarch.rpm"
RPM_HASH = "332ed71ce0e31f43d7c0520c791ceaa57f312d666bcf3a5266a2724545addf9e1d802a7eb7209c4e9f2ab428c6cd43f3ae32dfa73c850072cf9e0f71012d64bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ptyprocess \
python3.11dist-ptyprocess \
python311-ptyprocess \
python3dist-ptyprocess"

RDEPENDS:${PN} += "python-abi"

inherit rpm
