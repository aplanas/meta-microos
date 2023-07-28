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

RPM_NAME = "python311-subprocess-tee-0.4.1-5.1.noarch.rpm"
RPM_HASH = "da0d62da66c8fd360a529ddcfb3d8bac2bd8f76651af1b894768abbc901f9023b52ebeca2a3744837300281556f18406a4dfde83b95ffaab7930a57b7c3d526a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subprocess-tee \
python3.11dist-subprocess-tee \
python311-subprocess-tee \
python3dist-subprocess-tee"

RDEPENDS:${PN} += "python-abi"

inherit rpm
