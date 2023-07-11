SUMMARY = "A template engine written in pure Python"
DESCRIPTION = "Jinja2 is a template engine written in pure Python.  It provides a Django \
inspired non-XML syntax but supports inline expressions and an optional \
sandboxed environment."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "python311-Jinja2-3.1.2-3.3.aarch64.rpm"
RPM_HASH = "a380ca75b1b0594fa2a337f823336100a831338edc4b6c241f846614b1c6f1edb5417b5d6ca372a13cd36d5d9f4e6381efb554950b01c39a0e6b9222df6adaa4"

RPROVIDES:${PN} += "python3-Jinja2 \
python3-jinja2 \
python3.11dist-jinja2 \
python311-Jinja2 \
python311-jinja2 \
python3dist-jinja2"

RDEPENDS:${PN} += "python-abi \
python311-MarkupSafe"

inherit rpm
