SUMMARY = "A template engine written in pure Python"
DESCRIPTION = "Jinja2 is a template engine written in pure Python.  It provides a Django \
inspired non-XML syntax but supports inline expressions and an optional \
sandboxed environment."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "python39-Jinja2-3.1.2-4.1.aarch64.rpm"
RPM_HASH = "cd5c162a81bd20a0872e927a79c01a2d927e0e018a2ac9a0890a3a413ca849add4c8e989df2daf738a8b38287c7a471b493b55c1584b6f6e1803885d57798c88"

RPROVIDES:${PN} += "python3.9dist-jinja2 \
python39-Jinja2 \
python39-jinja2 \
python3dist-jinja2"

RDEPENDS:${PN} += "python-abi \
python39-MarkupSafe"

inherit rpm
