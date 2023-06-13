SUMMARY = "Microsoft Azure Cognitive Services Content Moderator Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Content Moderator Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-cognitiveservices-vision-contentmoderator-1.0.0-3.11.noarch.rpm"
RPM_HASH = "fff2fb6e5b09cf9dc91dbd4bd042fb7e32c55982c1bc7c2b412fe80a0096d959042f3fe7429209ce3e1f9ffd6ac1872528e399c37876633759a94605762ddbb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-vision-contentmoderator) \
python39-azure-cognitiveservices-vision-contentmoderator \
python3dist(azure-cognitiveservices-vision-contentmoderator)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-vision-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
