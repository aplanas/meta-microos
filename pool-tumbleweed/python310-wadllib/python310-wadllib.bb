SUMMARY = "Navigate HTTP resources using WADL files as guides"
DESCRIPTION = "An Application object represents a web service described by a WADL \
file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python310-wadllib-1.3.6-1.8.noarch.rpm"
RPM_HASH = "6c4c0b6a4a9edf2b7a4a7581217b411c266025cc2ce05e9fc6b7b372ca0a832f3548f963eda1174b900817644b3e2db8376ae7208a9b06313959c2bf19fa3e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wadllib \
python3.10dist-wadllib \
python310-wadllib \
python3dist-wadllib"

RDEPENDS:${PN} += "python-abi \
python310-lazr.uri"

inherit rpm
