SUMMARY = "Tool to create a JIRA or other Workflow from markdown files"
DESCRIPTION = "A tool which can convert typically 'VCS managed' mardown checklist \
into e.g. a linked structure of Jira Epics. This tool can not only \
create checklists, but also update them."
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python310-md2workflow-1.4.18-4.11.noarch.rpm"
RPM_HASH = "cd5ed7c5561e947a2729c31603722e858291462b7fc24c4a0b413d26c050132fe1f912507a01b857e2f7d61e6256b903bff616ec4e74c81d35bc151cf296bdd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "md2workfow \
python3-md2workflow \
python3.10dist-md2workflow \
python310-md2workflow \
python3dist-md2workflow"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-icalendar \
python310-md2workflow-common \
update-alternatives"

inherit rpm
