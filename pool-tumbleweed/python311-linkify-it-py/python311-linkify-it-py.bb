SUMMARY = "Links recognition library with FULL unicode support"
DESCRIPTION = "Links recognition library with FULL unicode support. Focused on high quality link patterns detection in plain text. \
 \
Why it's awesome: \
* Full unicode support, with astral characters! \
* International domains support. \
* Allows rules extension & custom normalizers."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-linkify-it-py-2.0.2-1.3.noarch.rpm"
RPM_HASH = "01894e91a11b9bc15c07a55c486fd913d85a3bec4ea8e0887ef107d66f8690d28ddf6d8ab0e4afa35c26267ad2677eea542fe28019cc58f91aa9dd863da0eb1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linkify-it-py \
python3.11dist-linkify-it-py \
python311-linkify-it-py \
python3dist-linkify-it-py"

RDEPENDS:${PN} += "python-abi \
python311-uc-micro-py"

inherit rpm
