SUMMARY = "Captures the output of subprocesses in real-time"
DESCRIPTION = "This package provides a drop-in alternative to `subprocess.run` that \
captures the output while still printing it in real-time, just the way \
`tee` does. \
 \
Printing output in real-time while still capturing is valuable for \
any tool that executes long-running child processes. For those, you do want \
to provide instant feedback (progress) related to what is happening."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-subprocess-tee-0.4.1-4.3.noarch.rpm"
RPM_HASH = "7a03c2c74a51af64c0bb423e0b35d8c0747d23ad27cab9a68905aa83d327081d57821271d9f75acc8c70ad567f6f1d7aa2047a07e1da3169c6beac96bbd7e16c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-subprocess-tee \
python39-subprocess-tee \
python3dist-subprocess-tee"

RDEPENDS:${PN} += "python-abi"

inherit rpm
