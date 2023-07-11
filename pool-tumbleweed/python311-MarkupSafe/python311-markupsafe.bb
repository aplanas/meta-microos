SUMMARY = "Implements a XML/HTML/XHTML Markup safe string for Python"
DESCRIPTION = "Implements a unicode subclass that supports HTML strings. This can be used to \
safely encode strings for dynamically generated web pages."
LICENSE = "BSD-3-Clause"

PV = "2.1.3"

RPM_NAME = "python311-MarkupSafe-2.1.3-1.1.aarch64.rpm"
RPM_HASH = "9de9daa8d2e14b5f7d7f48d6048b0bbbc02868a127bbf05d11507b8e8f4125fa962aaca38bd7b3599e4d524b372c33a67d30d69cd0cc1df3139c0f4b3f762d9f"

RPROVIDES:${PN} += "python3-MarkupSafe \
python3.11dist-markupsafe \
python311-MarkupSafe \
python3dist-markupsafe"

RDEPENDS:${PN} += "libc.so.6 \
python-abi \
python311-base"

inherit rpm
