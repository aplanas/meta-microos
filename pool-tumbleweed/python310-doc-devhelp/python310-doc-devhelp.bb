SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-doc-devhelp-3.10.12-3.1.aarch64.rpm"
RPM_HASH = "566e12cf2b0a71266e46f6369ce83be408cffe881eb51f36159ed61760c1b2939ec2e60042ea9664362e1455a300361cb8c83baaab55070b4f35fee878cb8f35"

RPROVIDES:${PN} += "python310-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
