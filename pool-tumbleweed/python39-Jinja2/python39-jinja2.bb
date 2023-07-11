SUMMARY = "A template engine written in pure Python"
DESCRIPTION = "Jinja2 is a template engine written in pure Python.  It provides a Django \
inspired non-XML syntax but supports inline expressions and an optional \
sandboxed environment."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "python39-Jinja2-3.1.2-3.3.aarch64.rpm"
RPM_HASH = "0c28bd2eec0bf619e22131e453443c7d3fcb540937814fd8c078b925a16debeade66978fc5c2f05a8b0a73e7cfa5ca81112a617157d689a39e7c127285230457"

RPROVIDES:${PN} += "python3.9dist-jinja2 \
python39-Jinja2 \
python39-jinja2 \
python3dist-jinja2"

RDEPENDS:${PN} += "python-abi \
python39-MarkupSafe"

inherit rpm
