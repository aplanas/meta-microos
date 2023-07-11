SUMMARY = "Tool to create a JIRA or other Workflow from markdown files"
DESCRIPTION = "A tool which can convert typically 'VCS managed' mardown checklist \
into e.g. a linked structure of Jira Epics. This tool can not only \
create checklists, but also update them."
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python310-md2workflow-1.4.18-4.13.noarch.rpm"
RPM_HASH = "6259819ba49f6450afcd06b9df51d220938458ae8a1108f46b35e6ecff54707971903c8b799029c3796f5c8f68c37545112e98b25bb7495449ea3195aad489ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "md2workfow \
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
