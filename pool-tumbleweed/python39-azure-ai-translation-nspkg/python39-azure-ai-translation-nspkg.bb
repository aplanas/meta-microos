SUMMARY = "Microsoft Azure ai-translation Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-translation Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-ai-translation-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "df4172f45f6f0e86af954ab44078bc9e06c63560d6baf71b95965869169a47e9ddde05d0781420d8cb1969618dc9870284cfb017b272e0b8555f13a974046e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-ai-translation-nspkg \
python39-azure-ai-translation-nspkg \
python3dist-azure-ai-translation-nspkg"

RDEPENDS:${PN} += "python39-azure-ai-nspkg \
python39-azure-nspkg"

inherit rpm
