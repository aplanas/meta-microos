SUMMARY = "Library for editing JIRA issues as local text files"
DESCRIPTION = "This library lets the user stay out of JIRA by letting them edit JIRA \
issues as a collection of text files using an interface inspired by \
`git` and `hg`."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python39-jirafs-2.3.1-1.1.noarch.rpm"
RPM_HASH = "cc56b8af1c15361d50dd8a72db8774ace980afcfe6951f0146a63e45554a6a04c45ee7507541142caf75ea1f9fa9857f8ef5d7935ebe425d5b9d2481955e9ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jirafs \
python39-jirafs \
python3dist-jirafs"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
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
