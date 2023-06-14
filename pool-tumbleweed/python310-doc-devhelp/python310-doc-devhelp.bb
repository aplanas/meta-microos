SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.10.11"

RPM_NAME = "python310-doc-devhelp-3.10.11-1.1.aarch64.rpm"
RPM_HASH = "51f6ad55b1ca8179ef943003b8c45335e859778e6a8d7f4f60a6fdec7595757e4244f3adaa54e63272b3048d9dfbfa2b6a1a0b338a4bdc7a9be97f0878319e27"

RPROVIDES:${PN} += "python3-doc-devhelp \
python310-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
