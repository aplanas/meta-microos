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

RPM_NAME = "python310-subprocess-tee-0.4.1-4.1.noarch.rpm"
RPM_HASH = "557762ae27e7d03754242b6a4c8ed7211a65efc8e043e4bb7f6cf357a303e7c8ca8b973c6eea4b4ee8b060804109ce85c6698dfffa90c8ea4c4afc15ef123231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subprocess-tee \
python3.10dist(subprocess-tee) \
python310-subprocess-tee \
python3dist(subprocess-tee)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
