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

RPM_NAME = "python39-subprocess-tee-0.4.1-5.1.noarch.rpm"
RPM_HASH = "13ca8d0553d7ecfbcecb3a61dc2f8acb92f0929de3b3fc350ff2bc99a87b6a4de175906bacd5d74c7d27e4d6cf93c6e503984d28de7958f56c503cfb27e3bc5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-subprocess-tee \
python39-subprocess-tee \
python3dist-subprocess-tee"

RDEPENDS:${PN} += "python-abi"

inherit rpm
