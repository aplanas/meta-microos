SUMMARY = "Tool to create a JIRA or other Workflow from markdown files"
DESCRIPTION = "A tool which can convert typically 'VCS managed' mardown checklist \
into e.g. a linked structure of Jira Epics. This tool can not only \
create checklists, but also update them."
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python311-md2workflow-1.4.18-4.11.noarch.rpm"
RPM_HASH = "29e50218f7cf1a3017b1a650d5747a75c3d1302d0c810767116f08b4dcc2fe243e6837ad3d509e30763a06bbd30b36c17da8178fab244c75e861a1e35e5a045c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "md2workfow \
python3.11dist(md2workflow) \
python311-md2workflow \
python3dist(md2workflow)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-icalendar \
python311-md2workflow-common \
update-alternatives"

inherit rpm
