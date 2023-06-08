SUMMARY = "Check File System Usage"
DESCRIPTION = "fs-check checks file system sizes to see if they are getting too full. \
It uses a configuration file that specifies the file systems to check, \
e-mail contacts, trigger thresholds (percentage or amount used and \
unused), and a report program to run. It includes fs-report, which \
shows things like the largest files, the newest files, and core files. \
It can be run from cron or as a daemon."
LICENSE = "GPL-2.0-or-later"

PV = "0.9"

RPM_NAME = "fs-check-0.9-55.4.noarch.rpm"
RPM_HASH = "cbe2cc71666b079376979c9be5f12df698faa47c4539efe8ef5809e1e406b0cd1e01789114f9b54ac561457850331e138df046fe6e19010bc47f6c8d60ea8f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(fs-check) fs-check"
RDEPENDS:${PN} += "/usr/bin/perl mailx"

inherit rpm
