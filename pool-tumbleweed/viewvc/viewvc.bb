SUMMARY = "Browse a Subversion Repository with a Web Browser"
DESCRIPTION = "ViewVC is a browser interface for CVS and Subversion version control \
repositories. It generates templatized HTML to present navigable \
directory, revision, and change log listings. It can display specific \
versions of files as well as diffs between those versions. Basically, \
ViewVC provides the bulk of the report-like functionality you expect \
out of your version control tool, but much prettier than the average \
textual command-line program output. \
 \
ViewVC is the successor of ViewCVS."
LICENSE = "BSD-2-Clause"

PV = "1.3.0~dev20230104"

RPM_NAME = "viewvc-1.3.0~dev20230104-1.2.noarch.rpm"
RPM_HASH = "a85fd682e7921370b0c180f53f4ab647149d4f167a3618401b98b6126ba87ee5e609c7fcdb644006f996d96151be6f5dfc1559d47e1648dff78e80db74c11e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-viewvc \
subversion-viewcvs \
viewcvs \
viewvc"

RDEPENDS:${PN} += "/usr/bin/python3 \
subversion-python"

inherit rpm
