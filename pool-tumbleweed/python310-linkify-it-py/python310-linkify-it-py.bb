SUMMARY = "Links recognition library with FULL unicode support"
DESCRIPTION = "Links recognition library with FULL unicode support. Focused on high quality link patterns detection in plain text. \
 \
Why it's awesome: \
* Full unicode support, with astral characters! \
* International domains support. \
* Allows rules extension & custom normalizers."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-linkify-it-py-2.0.2-1.1.noarch.rpm"
RPM_HASH = "36902e4fe8552c48aebfbaa68d92ee7957113ecc9c93ed4476e743c40f1b829d965b309c927f75d8b75e9575dbf3ba381964f065e69aee9820ff1126128db676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linkify-it-py \
python3.10dist-linkify-it-py \
python310-linkify-it-py \
python3dist-linkify-it-py"

RDEPENDS:${PN} += "python-abi \
python310-uc-micro-py"

inherit rpm
