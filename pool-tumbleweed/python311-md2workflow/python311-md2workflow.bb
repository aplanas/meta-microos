SUMMARY = "Tool to create a JIRA or other Workflow from markdown files"
DESCRIPTION = "A tool which can convert typically 'VCS managed' mardown checklist \
into e.g. a linked structure of Jira Epics. This tool can not only \
create checklists, but also update them."
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python311-md2workflow-1.4.18-4.13.noarch.rpm"
RPM_HASH = "a9fdc89e31c3d5c1797664f83430d10b44e2e331b15e79496d948f184d561e06e0bc4502b8a55a40faa5eee69c475d2575c528d8df5fa3d8d59599e5003a48c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "md2workfow \
python3-md2workflow \
python3.11dist-md2workflow \
python311-md2workflow \
python3dist-md2workflow"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-icalendar \
python311-md2workflow-common \
update-alternatives"

inherit rpm
