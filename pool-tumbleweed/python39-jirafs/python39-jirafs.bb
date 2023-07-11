SUMMARY = "Library for editing JIRA issues as local text files"
DESCRIPTION = "This library lets the user stay out of JIRA by letting them edit JIRA \
issues as a collection of text files using an interface inspired by \
`git` and `hg`."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python39-jirafs-2.3.1-1.3.noarch.rpm"
RPM_HASH = "478122251d2173c0f9f32d0b77cee7e10ac3ee8393f3291ace3d3c22c4fe367c5406bdc0a773190e53c59e758ce308e001e4417cdf3a9b4be56bec9361805bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jirafs \
python39-jirafs \
python3dist-jirafs"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
git-core \
python-abi \
python39-Jinja2 \
python39-PrettyTable \
python39-blessings \
python39-environmental-override \
python39-jira \
python39-prettytable \
python39-python-dateutil \
python39-watchdog \
update-alternatives"

inherit rpm
