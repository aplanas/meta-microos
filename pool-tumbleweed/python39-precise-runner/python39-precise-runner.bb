SUMMARY = "Wrapper to use Mycroft Precise Wake Word Listener"
DESCRIPTION = "Wrapper to use the Mycroft Precise Wake Word Listener"
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python39-precise-runner-0.3.1-1.17.noarch.rpm"
RPM_HASH = "839c6a2c2aac40dea5f03cfead69339e526399cff44e74d4f871c9c89e2b5fc7194a9ce1ac1a8560e4d26f37f940c82eefbe38970266cde35035e5c2b0bac637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-precise-runner \
python39-precise-runner \
python3dist-precise-runner"

RDEPENDS:${PN} += "python-abi \
python39-PyAudio"

inherit rpm
