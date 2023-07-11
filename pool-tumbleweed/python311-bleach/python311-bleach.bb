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

RPM_NAME = "python311-bleach-6.0.0-2.1.noarch.rpm"
RPM_HASH = "fe855dca29c1fd3d620d3d137e8aa74ab764d8d52a4a84f07b42c621666c18945e93ddb8a7807fcfe70d0c7763473a0f1f5f2433388f9519a213d0ad55dfca87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bleach \
python3.11dist-bleach \
python311-bleach \
python3dist-bleach"

RDEPENDS:${PN} += "python-abi \
python311-html5lib"

inherit rpm
