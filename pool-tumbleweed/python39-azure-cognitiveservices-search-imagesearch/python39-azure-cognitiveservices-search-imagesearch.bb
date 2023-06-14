SUMMARY = "Microsoft Azure ImageSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-cognitiveservices-search-imagesearch-2.0.0-2.15.noarch.rpm"
RPM_HASH = "b47090f54b3562ed6b9033041bf133cf29a6002fb7eb82c473961a60ad1081e1954022eef68f369450c797ca98464dab0aa3eaa6b1836babeb802e2385857707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-search-imagesearch \
python39-azure-cognitiveservices-search-imagesearch \
python3dist-azure-cognitiveservices-search-imagesearch"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-search-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
