SUMMARY = "Python - JSON-Patches"
DESCRIPTION = "Python module to apply JSON-Patches (according to RFC 6902)."
LICENSE = "BSD-3-Clause"

PV = "1.32"

RPM_NAME = "python310-jsonpatch-1.32-4.3.noarch.rpm"
RPM_HASH = "5acfad626d74b03f8798b3f1b69e63ff6048644d5d193130b01cb629945614fea07d5f43ffb89f0476ef4964f237895c1d06046b2e5c2b33c825b91e2405a322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonpatch \
python310-jsonpatch \
python3dist-jsonpatch"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-jsonpointer"

inherit rpm
