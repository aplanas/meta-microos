SUMMARY = "Links recognition library with FULL unicode support"
DESCRIPTION = "Links recognition library with FULL unicode support. Focused on high quality link patterns detection in plain text. \
 \
Why it's awesome: \
* Full unicode support, with astral characters! \
* International domains support. \
* Allows rules extension & custom normalizers."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-linkify-it-py-2.0.2-1.1.noarch.rpm"
RPM_HASH = "8442464b8d208cf68aea0b34d4283ac2d9c1120a01f9f65d1b4cb546f7baf42c0d40f639ad68a18da3a7700b590a334bfb8f738783b7e54c2637589100674863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-linkify-it-py \
python39-linkify-it-py \
python3dist-linkify-it-py"

RDEPENDS:${PN} += "python-abi \
python39-uc-micro-py"

inherit rpm
