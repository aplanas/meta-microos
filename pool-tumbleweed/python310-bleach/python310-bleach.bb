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

RPM_NAME = "python310-bleach-6.0.0-2.1.noarch.rpm"
RPM_HASH = "b1674bbfc1340c77c75464c6eead8f8603234c5e10f0a8779bc364abe27811af27ee25e2701ca05d288dd954ad59a47718def5c7dcecfbe1d8710d85612e87d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bleach \
python310-bleach \
python3dist-bleach"

RDEPENDS:${PN} += "python-abi \
python310-html5lib"

inherit rpm
