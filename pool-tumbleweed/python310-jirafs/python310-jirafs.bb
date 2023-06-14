SUMMARY = "Library for editing JIRA issues as local text files"
DESCRIPTION = "This library lets the user stay out of JIRA by letting them edit JIRA \
issues as a collection of text files using an interface inspired by \
`git` and `hg`."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python310-jirafs-2.3.1-1.1.noarch.rpm"
RPM_HASH = "b1ed1bfa589045dbaeef09689d3f83e6fdb5134d566e02f471bac1437cd1338a354620483f90cb384af1085e9898e24c54f968f66c2111486a51c417034cbac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jirafs \
python3.10dist-jirafs \
python310-jirafs \
python3dist-jirafs"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
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
