SUMMARY = "A template engine written in pure Python"
DESCRIPTION = "Jinja2 is a template engine written in pure Python.  It provides a Django \
inspired non-XML syntax but supports inline expressions and an optional \
sandboxed environment."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "python310-Jinja2-3.1.2-4.1.aarch64.rpm"
RPM_HASH = "0e543823d3e061d70cffd6a5a95b2eb1092d0cb1953ea1140baafcb7cf1b3452410fad6ff7565eb983e0c5077fcf947156876d7d8e85ecb000550eb243f80a1c"

RPROVIDES:${PN} += "python3.10dist-jinja2 \
python310-Jinja2 \
python310-jinja2 \
python3dist-jinja2"

RDEPENDS:${PN} += "python-abi \
python310-MarkupSafe"

inherit rpm
