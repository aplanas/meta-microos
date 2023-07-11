SUMMARY = "Trello backup script"
DESCRIPTION = "This tool backups everything from Trello: \
 \
 * boards, open and closed, as JSON files \
 * lists, open and archived, as JSON files \
 * cards, open and archived, as JSON files \
 * attachments, downloaded as raw files \
 \
The script also creates a folder tree structure corresponding to \
the way data is organized. This is to make it more convenient to \
navigate locally between folders, as it mimics the flow from \
the web and mobile apps."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "trello-full-backup-0.3.1-1.13.noarch.rpm"
RPM_HASH = "f86810cde5b781028660b3f4511b785170edbb90664df4889aadde948943d8b9f79df1178fb258b519b41cb0f595f4a0a1c77dfd6a6aed991d3d536742c9e713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trello-full-backup \
python3dist-trello-full-backup \
trello-full-backup"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-requests"

inherit rpm
