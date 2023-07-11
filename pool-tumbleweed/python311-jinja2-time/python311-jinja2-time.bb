SUMMARY = "Jinja2 Extension for Dates and Times"
DESCRIPTION = "A Jinja2 extension providing support for dates and times."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-jinja2-time-0.2.0-4.3.noarch.rpm"
RPM_HASH = "9ca02929b50c02105515d50cc37af47b637beb06a614efb4b730399690fa5e49191de7f41526c0aaa2bee454e21d1c8df62af08635be55aa9731d265bcd03bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jinja2-time \
python3.11dist-jinja2-time \
python311-jinja2-time \
python3dist-jinja2-time"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-arrow"

inherit rpm
