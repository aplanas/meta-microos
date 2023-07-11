SUMMARY = "Links recognition library with FULL unicode support"
DESCRIPTION = "Links recognition library with FULL unicode support. Focused on high quality link patterns detection in plain text. \
 \
Why it's awesome: \
* Full unicode support, with astral characters! \
* International domains support. \
* Allows rules extension & custom normalizers."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-linkify-it-py-2.0.2-1.3.noarch.rpm"
RPM_HASH = "885c2647150bcdf261abb6da784d957093dff4e952659b8475883ae4903572690f9031abc99052d2bde0506866497fbcd0d31d802cfa15265da90da27073287d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-linkify-it-py \
python39-linkify-it-py \
python3dist-linkify-it-py"

RDEPENDS:${PN} += "python-abi \
python39-uc-micro-py"

inherit rpm
