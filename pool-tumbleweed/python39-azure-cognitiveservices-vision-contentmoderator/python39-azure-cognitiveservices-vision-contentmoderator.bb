SUMMARY = "Microsoft Azure Cognitive Services Content Moderator Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Content Moderator Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-cognitiveservices-vision-contentmoderator-1.0.0-3.12.noarch.rpm"
RPM_HASH = "8bc7c378700f3e395cdf88264c922d2254c38bd8a015e51660918af3526945d9896be8d689c55cf066fd22e0368780661552a56798c286a6f16c8ec3c5a240fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-vision-contentmoderator \
python39-azure-cognitiveservices-vision-contentmoderator \
python3dist-azure-cognitiveservices-vision-contentmoderator"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-vision-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
