SUMMARY = "Jinja2 Extension for Dates and Times"
DESCRIPTION = "A Jinja2 extension providing support for dates and times."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-jinja2-time-0.2.0-4.1.noarch.rpm"
RPM_HASH = "dd974e690e617c207a48060c6d8539db68f56a87f44550a1ed282074b370e519e45975aaf1b532dd6c4ea44777ece44794bef76898b235d98bd718ee1ece6d44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jinja2-time \
python3.10dist(jinja2-time) \
python310-jinja2-time \
python3dist(jinja2-time)"

RDEPENDS:${PN} += "python(abi) \
python310-Jinja2 \
python310-arrow"

inherit rpm
