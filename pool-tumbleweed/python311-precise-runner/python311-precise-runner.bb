SUMMARY = "Wrapper to use Mycroft Precise Wake Word Listener"
DESCRIPTION = "Wrapper to use the Mycroft Precise Wake Word Listener"
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python311-precise-runner-0.3.1-1.15.noarch.rpm"
RPM_HASH = "7966c9e2fd19651451dd3fd5ffe9d2bf0dac363a3a6c216db9fa1efce785e2a1bcd614d0e665168d7b51fee44242074028e43846ffafdf86294e0003c060a9c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(precise-runner) \
python311-precise-runner \
python3dist(precise-runner)"
RDEPENDS:${PN} += "python(abi) \
python311-PyAudio"

inherit rpm
