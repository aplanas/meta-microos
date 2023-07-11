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

RPM_NAME = "python39-bleach-6.0.0-2.1.noarch.rpm"
RPM_HASH = "714880aa811f2f363ea1cb09f22a62abe8574a43bf973858a75732e42a770443da8dc71c2a4412a26e3f30f663ef89d1cf701f8064eadd08843d77abfa36a210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bleach \
python39-bleach \
python3dist-bleach"

RDEPENDS:${PN} += "python-abi \
python39-html5lib"

inherit rpm
