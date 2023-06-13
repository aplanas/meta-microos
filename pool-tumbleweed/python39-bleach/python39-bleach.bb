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

RPM_NAME = "python39-bleach-6.0.0-1.1.noarch.rpm"
RPM_HASH = "d7b1c79d8e43b7f48a24de7e12ccc22ea353a053d3b442596a18491bcb2f25b47adf9ed5ae6735e54dbe105456272a0c84602ab6f0af5bdf8fd7aa621e7c6ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bleach) \
python39-bleach \
python3dist(bleach)"

RDEPENDS:${PN} += "python(abi) \
python39-html5lib"

inherit rpm
