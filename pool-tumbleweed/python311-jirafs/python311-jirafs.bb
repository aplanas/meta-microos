SUMMARY = "Library for editing JIRA issues as local text files"
DESCRIPTION = "This library lets the user stay out of JIRA by letting them edit JIRA \
issues as a collection of text files using an interface inspired by \
`git` and `hg`."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python311-jirafs-2.3.1-1.3.noarch.rpm"
RPM_HASH = "6ec0366c90023310c8b91296d61a2ad875c0785ba7ea5aac2bfa8059d0df1c2239e01647c7c4de5343e438dddcf749d960c3b4058d712cfc1cc52d30917fc70e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jirafs \
python3.11dist-jirafs \
python311-jirafs \
python3dist-jirafs"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
git-core \
python-abi \
python311-Jinja2 \
python311-PrettyTable \
python311-blessings \
python311-environmental-override \
python311-jira \
python311-prettytable \
python311-python-dateutil \
python311-watchdog \
update-alternatives"

inherit rpm
