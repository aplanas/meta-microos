SUMMARY = "A template engine written in pure Python"
DESCRIPTION = "Jinja2 is a template engine written in pure Python.  It provides a Django \
inspired non-XML syntax but supports inline expressions and an optional \
sandboxed environment."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "python310-Jinja2-3.1.2-3.3.aarch64.rpm"
RPM_HASH = "5f577110daa72d7b8dcb43688091585138bddd4ac9000f838948884e2509b3534f4bf478f5d4db67043a8595911013f243f1308ddc93349a82dc12528ee8c19c"

RPROVIDES:${PN} += "python3.10dist-jinja2 \
python310-Jinja2 \
python310-jinja2 \
python3dist-jinja2"

RDEPENDS:${PN} += "python-abi \
python310-MarkupSafe"

inherit rpm
