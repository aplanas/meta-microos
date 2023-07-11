SUMMARY = "Google Cloud Speech API client library"
DESCRIPTION = "Cloud Speech API converts audio to text by applying neural network models."
LICENSE = "Apache-2.0"

PV = "2.20.0"

RPM_NAME = "python39-google-cloud-speech-2.20.0-1.1.noarch.rpm"
RPM_HASH = "f0e48c0304f3b686934dbb713cd19c1f6d985669be447bdeb1d28f12420dc953def7752967ff22e2b49fd163769bf88964dda92307127e6fdb32e7537515f7b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-cloud-speech \
python39-google-cloud-speech \
python3dist-google-cloud-speech"

RDEPENDS:${PN} += "python-abi \
python39-google-api-core \
python39-proto-plus \
python39-protobuf"

inherit rpm
