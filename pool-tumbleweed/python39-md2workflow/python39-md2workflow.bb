SUMMARY = "Tool to create a JIRA or other Workflow from markdown files"
DESCRIPTION = "A tool which can convert typically 'VCS managed' mardown checklist \
into e.g. a linked structure of Jira Epics. This tool can not only \
create checklists, but also update them."
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python39-md2workflow-1.4.18-4.11.noarch.rpm"
RPM_HASH = "8a56406c44a7c23d816cac805c074d25db3e2b5a149b5f5c9c8acb8cc8f2770f0c15338eb129c32743e260ddc7ea104aa0536f8f8abd6839fa69a8634c73d260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "md2workfow \
python3.9dist(md2workflow) \
python39-md2workflow \
python3dist(md2workflow)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-icalendar \
python39-md2workflow-common \
update-alternatives"

inherit rpm
