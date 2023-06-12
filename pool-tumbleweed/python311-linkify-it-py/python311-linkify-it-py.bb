SUMMARY = "Links recognition library with FULL unicode support"
DESCRIPTION = "Links recognition library with FULL unicode support. Focused on high quality link patterns detection in plain text. \
 \
Why it's awesome: \
* Full unicode support, with astral characters! \
* International domains support. \
* Allows rules extension & custom normalizers."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-linkify-it-py-2.0.2-1.1.noarch.rpm"
RPM_HASH = "a738ae43d3c31a9d52bb637f487048708e724ba18dc180de790d5c554f5cce80cbd9133cce447db3672b7a8d8d1e25297387592b3a648fc5d2a2face8e7746be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(linkify-it-py) \
python311-linkify-it-py \
python3dist(linkify-it-py)"
RDEPENDS:${PN} += "python(abi) \
python311-uc-micro-py"

inherit rpm
