SUMMARY = "Tool to create a JIRA or other Workflow from markdown files"
DESCRIPTION = "A tool which can convert typically 'VCS managed' mardown checklist \
into e.g. a linked structure of Jira Epics. This tool can not only \
create checklists, but also update them."
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python39-md2workflow-1.4.18-4.13.noarch.rpm"
RPM_HASH = "efa6071bbb750d9f5d87ccbeb4f46da1ea9d09f6907d5d6eb406f54b68e15cb0bdc15d10f5cffd227b0fbf4e258e53defaf58f7730b69a9a12b21dee411e7139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "md2workfow \
python3.9dist-md2workflow \
python39-md2workflow \
python3dist-md2workflow"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-icalendar \
python39-md2workflow-common \
update-alternatives"

inherit rpm
