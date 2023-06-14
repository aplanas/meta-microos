SUMMARY = "Wrapper to use Mycroft Precise Wake Word Listener"
DESCRIPTION = "Wrapper to use the Mycroft Precise Wake Word Listener"
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python310-precise-runner-0.3.1-1.15.noarch.rpm"
RPM_HASH = "f6f0caed456cec9927a54c5f3a096ff3eee3a1db66dea585d070b12ed5ac04498589cbd9d1f36da7e2901e0195c6c56be89b447dcc75fc09880014475933f96b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-precise-runner \
python3.10dist-precise-runner \
python310-precise-runner \
python3dist-precise-runner"

RDEPENDS:${PN} += "python-abi \
python310-PyAudio"

inherit rpm
