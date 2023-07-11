SUMMARY = "Wrapper to use Mycroft Precise Wake Word Listener"
DESCRIPTION = "Wrapper to use the Mycroft Precise Wake Word Listener"
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python311-precise-runner-0.3.1-1.17.noarch.rpm"
RPM_HASH = "96bd6a1bb6fbae0a51ba0b2f0403877098cc684962c5fc71181755f66289bb8ba309cd818a9fe76990ef6b81663800765ea0903e72c9f2f2dbfa875748ac63ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-precise-runner \
python3.11dist-precise-runner \
python311-precise-runner \
python3dist-precise-runner"

RDEPENDS:${PN} += "python-abi \
python311-PyAudio"

inherit rpm
