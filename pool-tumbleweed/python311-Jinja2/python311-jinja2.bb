SUMMARY = "A template engine written in pure Python"
DESCRIPTION = "Jinja2 is a template engine written in pure Python.  It provides a Django \
inspired non-XML syntax but supports inline expressions and an optional \
sandboxed environment."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "python311-Jinja2-3.1.2-4.1.aarch64.rpm"
RPM_HASH = "20242650276747664f5a007f4d4bd1f1fe4237f45c7de730127c688563461d88c84265dcf82921a3463ba85e28d31f61d811bdc2be0a87919b118b68e06d2468"

RPROVIDES:${PN} += "python3-Jinja2 \
python3-jinja2 \
python3.11dist-jinja2 \
python311-Jinja2 \
python311-jinja2 \
python3dist-jinja2"

RDEPENDS:${PN} += "python-abi \
python311-MarkupSafe"

inherit rpm
