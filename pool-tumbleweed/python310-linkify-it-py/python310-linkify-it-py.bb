SUMMARY = "Links recognition library with FULL unicode support"
DESCRIPTION = "Links recognition library with FULL unicode support. Focused on high quality link patterns detection in plain text. \
 \
Why it's awesome: \
* Full unicode support, with astral characters! \
* International domains support. \
* Allows rules extension & custom normalizers."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-linkify-it-py-2.0.2-1.3.noarch.rpm"
RPM_HASH = "755a79cfc1bc3d61011fcd209ad620825774f1b6cc6ceec2a88bd0544984e0557244a784dbb4707feac709c7bb36a7e97c78d575d81de7c56e2ea66ff92edb0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-linkify-it-py \
python310-linkify-it-py \
python3dist-linkify-it-py"

RDEPENDS:${PN} += "python-abi \
python310-uc-micro-py"

inherit rpm
