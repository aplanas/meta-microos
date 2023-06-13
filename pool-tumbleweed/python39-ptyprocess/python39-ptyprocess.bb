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

RPM_NAME = "python39-ptyprocess-0.7.0-2.1.noarch.rpm"
RPM_HASH = "00df9b104a2cdc75701fdb8dfe11d570441b806b65636b6af5432e0db6e96465548657c27d93289b6f26614826245860666d7bf86930bd97ae0b12a25d3474d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ptyprocess) \
python39-ptyprocess \
python3dist(ptyprocess)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
