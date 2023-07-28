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

RPM_NAME = "python310-subprocess-tee-0.4.1-5.1.noarch.rpm"
RPM_HASH = "c1c29e11c34e3f8f0974e47146f52da594fefe5cfa493423557635c5b134e2bed270f45d8c6f916eadcc46a653cb4bb6dc8a8122e58ebcdb03570f84fa95b7b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-subprocess-tee \
python310-subprocess-tee \
python3dist-subprocess-tee"

RDEPENDS:${PN} += "python-abi"

inherit rpm
