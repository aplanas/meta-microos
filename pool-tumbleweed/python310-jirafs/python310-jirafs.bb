SUMMARY = "Library for editing JIRA issues as local text files"
DESCRIPTION = "This library lets the user stay out of JIRA by letting them edit JIRA \
issues as a collection of text files using an interface inspired by \
`git` and `hg`."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python310-jirafs-2.3.1-1.3.noarch.rpm"
RPM_HASH = "f131fa6a2904175a8bc1a8482f50e0d3a14fcd87c1256b293b5ceff0f7562e1574605a1000ba2d05d5093ae51f10906440a0c9489ac7f4acb66aa3bce46c2d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jirafs \
python310-jirafs \
python3dist-jirafs"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
git-core \
python-abi \
python310-Jinja2 \
python310-PrettyTable \
python310-blessings \
python310-environmental-override \
python310-jira \
python310-prettytable \
python310-python-dateutil \
python310-watchdog \
update-alternatives"

inherit rpm
