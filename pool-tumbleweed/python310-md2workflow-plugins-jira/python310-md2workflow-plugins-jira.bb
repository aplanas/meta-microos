SUMMARY = "Jira plugin for md2workflow"
DESCRIPTION = "Jira plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python310-md2workflow-plugins-jira-1.4.18-4.13.noarch.rpm"
RPM_HASH = "bc3d49f19a0d2bb7773b2a47a201083085c968c59230cf901fdf0935491bf7315852b6e73a2ed71390259ad5997c7240639cb7c63281edfa114deb35eb8ca1d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-md2workflow-plugins-jira"

RDEPENDS:${PN} += "python-abi \
python310-jira \
python310-md2workflow"

inherit rpm
