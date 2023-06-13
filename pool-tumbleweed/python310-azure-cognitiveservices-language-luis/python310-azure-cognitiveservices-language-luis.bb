SUMMARY = "Microsoft Azure Cognitive Services LUIS Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services LUIS Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-azure-cognitiveservices-language-luis-0.7.0-2.11.noarch.rpm"
RPM_HASH = "373b27c4277795ceed937468bd7e10d48b3f047e28c7ba64cec33e47f8370b399abbf4adad9c1a4224a7c970235fc441fe21fa4136ebc3cba1e7acad0136e6e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-language-luis \
python3.10dist(azure-cognitiveservices-language-luis) \
python310-azure-cognitiveservices-language-luis \
python3dist(azure-cognitiveservices-language-luis)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-cognitiveservices-language-nspkg \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest \
python310-msrestazure"

inherit rpm
