SUMMARY = "Documentation files for python-shodan"
DESCRIPTION = "HTML documentation on the API and examples for python-shodan."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python-shodan-doc-1.28.0-1.5.noarch.rpm"
RPM_HASH = "16bda449dd0f472ddf245deceb45b03c2e354ed4aaf1a194e5ee20f27de7cd8dbaa2b961b9b413c030739310f12b7020c7f8d57e4aa140b639678e2033ac079e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-shodan-doc \
python310-shodan-doc \
python311-shodan-doc \
python39-shodan-doc"
RDEPENDS:${PN} += ""

inherit rpm
