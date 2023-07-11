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

RPM_NAME = "python311-subprocess-tee-0.4.1-4.3.noarch.rpm"
RPM_HASH = "7da6effcdc031181d518b6df15cd50593f0801254828fb13662a4485526f3c96f1772b4277511dba86d307598e3632d80c91448ee6ff5083df65a040494c4a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subprocess-tee \
python3.11dist-subprocess-tee \
python311-subprocess-tee \
python3dist-subprocess-tee"

RDEPENDS:${PN} += "python-abi"

inherit rpm
