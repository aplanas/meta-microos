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

RPM_NAME = "python311-bleach-6.0.0-1.1.noarch.rpm"
RPM_HASH = "a106ad1031504a5e1c58dfd3d87d4265fe2da90d9efd845235ef4e67ef4a85bc95ba25f070c114d001231e5ca7038d422f8c8ee5ef79740c326480c91eceafaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bleach) \
python311-bleach \
python3dist(bleach)"

RDEPENDS:${PN} += "python(abi) \
python311-html5lib"

inherit rpm
