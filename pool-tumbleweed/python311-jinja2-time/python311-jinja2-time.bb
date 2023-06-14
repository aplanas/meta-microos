SUMMARY = "Jinja2 Extension for Dates and Times"
DESCRIPTION = "A Jinja2 extension providing support for dates and times."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-jinja2-time-0.2.0-4.1.noarch.rpm"
RPM_HASH = "0f05b8c8ac802ea8f310f3c76362570eab293b7626a0f5133ce67027d9309a601bfe0ee98c376015b34def125af8d914c6d893e1c84c8d471f544515943ff24d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jinja2-time \
python311-jinja2-time \
python3dist-jinja2-time"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-arrow"

inherit rpm
