SUMMARY = "Microsoft Azure ai-translation Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-translation Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-ai-translation-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "a7b8b51f852196885de463d7723653be24cbb426dced022136f33ea6dd2388a737f3391a1130fe36f550b23ee5333272fa0c69903230308eddb1396b93da0bd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-ai-translation-nspkg \
python310-azure-ai-translation-nspkg \
python3dist-azure-ai-translation-nspkg"

RDEPENDS:${PN} += "python310-azure-ai-nspkg \
python310-azure-nspkg"

inherit rpm
