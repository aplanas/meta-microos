SUMMARY = "A whitelist-based HTML-sanitizing tool"
DESCRIPTION = "Bleach is an HTML sanitation library that escapes or strips markup and \
attributes based on a white list. Bleach can also linkify text safely, applying \
filters that Django's ``urlize`` filter cannot, and optionally setting ``rel`` \
attributes, even on links already in the text. \
 \
Bleach is intended for sanitizing text from *untrusted* sources. \
 \
Because it relies on html5lib, Bleach is as good as modern browsers at dealing \
with weird, quirky HTML fragments. Bleach's methods will fix \
unbalanced or mis-nested tags. \
 \
Documentation is at http://bleach.readthedocs.org/ ."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python310-bleach-6.0.0-1.1.noarch.rpm"
RPM_HASH = "8fcd75352d52c7ecb8944d01e4b9a929dffdf6d7f7e8ee273ab611ee6836153f5f83f5a7c532063f55872bfbda75fd63256890466f7b8b75d90c848de5b23b8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bleach \
python3.10dist(bleach) \
python310-bleach \
python3dist(bleach)"

RDEPENDS:${PN} += "python(abi) \
python310-html5lib"

inherit rpm
