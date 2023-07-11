SUMMARY = "Tool to submit code to Gerrit"
DESCRIPTION = "A git command for submitting branches to Gerrit \
 \
git-review is a tool that helps submitting git branches to gerrit for \
review."
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "git-review-2.3.1-2.2.noarch.rpm"
RPM_HASH = "1554cb789daf043005091be171154f06fc5e673e7eaabd6d834279c12445a457f697de127e027619121ba717ccf2e1de6a9305693d8296d812940f312837c20a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-review \
python3-git-review \
python3.11dist-git-review \
python3dist-git-review"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi \
python3-requests"

inherit rpm
