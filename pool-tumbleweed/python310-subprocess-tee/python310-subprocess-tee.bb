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

RPM_NAME = "python310-subprocess-tee-0.4.1-4.3.noarch.rpm"
RPM_HASH = "f3eec3e736b55044fb543ecac9272f9fed0e3f5dae46d6bccfba2555c290275a5416240f64769e1b963aef2a9936230db46e4777bbb223545e54d9e4e6d0dde9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-subprocess-tee \
python310-subprocess-tee \
python3dist-subprocess-tee"

RDEPENDS:${PN} += "python-abi"

inherit rpm
