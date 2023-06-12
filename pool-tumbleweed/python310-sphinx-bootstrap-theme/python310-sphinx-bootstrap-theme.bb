SUMMARY = "Sphinx Bootstrap Theme"
DESCRIPTION = "This Sphinx theme integrates the Bootstrap CSS / JavaScript framework \
with various layout options, hierarchical menu navigation, and \
mobile-friendly responsive design. It is configurable, extensible, and \
can use any number of different Bootswatch CSS themes."
LICENSE = "Apache-2.0 & MIT"

PV = "0.8.1"

RPM_NAME = "python310-sphinx-bootstrap-theme-0.8.1-2.2.noarch.rpm"
RPM_HASH = "5e423b53d8a35cc60c08d2679ffc837f75a310aba27a6cc920df66fb055d9e861cf82911ccd57482c7cdc2aa11c5e2d58720fd581fd2de1dc618c9fcbd65bf8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-bootstrap-theme \
python3.10dist(sphinx-bootstrap-theme) \
python310-sphinx-bootstrap-theme \
python3dist(sphinx-bootstrap-theme)"
RDEPENDS:${PN} += "python(abi) \
python310-Sphinx"

inherit rpm
