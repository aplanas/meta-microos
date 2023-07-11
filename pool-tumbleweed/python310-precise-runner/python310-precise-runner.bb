SUMMARY = "Wrapper to use Mycroft Precise Wake Word Listener"
DESCRIPTION = "Wrapper to use the Mycroft Precise Wake Word Listener"
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python310-precise-runner-0.3.1-1.17.noarch.rpm"
RPM_HASH = "f7c972e4a8a508081072079b6aa3c63ea3456185d640ecf1a33b215c97925864f211fde82c4551a46f25aaf919d0c5f66d7622fc16711068965ab1e252c6c431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-precise-runner \
python310-precise-runner \
python3dist-precise-runner"

RDEPENDS:${PN} += "python-abi \
python310-PyAudio"

inherit rpm
