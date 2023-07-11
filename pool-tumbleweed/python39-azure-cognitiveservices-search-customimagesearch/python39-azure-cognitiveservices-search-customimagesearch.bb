SUMMARY = "Microsoft Azure Cognitive Services Custom Image Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-azure-cognitiveservices-search-customimagesearch-0.2.0-2.16.noarch.rpm"
RPM_HASH = "edfe22d146ed1d74cae31f54da851f7842293e19407b67446d38ed9c302d876b7c922b78805a8a52e39b456bd81f4d6ed7224ce2a04fea7bd30d2f7400ef6dbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-search-customimagesearch \
python39-azure-cognitiveservices-search-customimagesearch \
python3dist-azure-cognitiveservices-search-customimagesearch"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-msrest"

inherit rpm
