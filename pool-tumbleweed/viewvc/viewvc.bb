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

PV = "1.3.0~dev20230511"

RPM_NAME = "viewvc-1.3.0~dev20230511-1.1.noarch.rpm"
RPM_HASH = "46f369ed76a93ad09b81a1760bcd26744db154aaa5f312c66ac1af3001504c6c0d93e1fd7969e6d27dd1270f0bcc568af38cc2d8426932bba5aafc2bc733ce8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-viewvc \
subversion-viewcvs \
viewcvs \
viewvc"

RDEPENDS:${PN} += "/usr/bin/python3 \
subversion-python"

inherit rpm
